package com.example.sravanreddy.bbvaassignment.mapactivity.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.example.sravanreddy.bbvaassignment.mapactivity.data.model.BankDetails;
import com.example.sravanreddy.bbvaassignment.BBVAList.BBVAListFragment;
import com.example.sravanreddy.bbvaassignment.R;
import com.example.sravanreddy.bbvaassignment.locationdetailsactivity.LocationDetails;
import com.example.sravanreddy.bbvaassignment.mapactivity.presenter.IPresenter;
import com.example.sravanreddy.bbvaassignment.mapactivity.presenter.Persenter;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, IView{

    private GoogleMap mMap;
    private GoogleApiClient googleApiClient;
    private FusedLocationProviderApi fusedLocationProviderApi;
    private LocationRequest locationRequest;
    private double latitude, longitude;
    private BankDetails bankDetails;
    private IPresenter ipresenter;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        googleApiClient = new GoogleApiClient.Builder(this)
                .addApi(LocationServices.API)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this).build();
        fusedLocationProviderApi = LocationServices.FusedLocationApi;
        locationRequest = new LocationRequest();
        locationRequest.setInterval(30000);
        locationRequest.setFastestInterval(5000);
        locationRequest.setPriority(locationRequest.PRIORITY_BALANCED_POWER_ACCURACY);

        ipresenter = new Persenter(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater() .inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.map_view:
                SupportMapFragment mapFragment2 = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
                ViewGroup.LayoutParams params2 = mapFragment2.getView().getLayoutParams();
                params2.height = 1550;
                params2.width = 1050;
                mapFragment2.getView().setLayoutParams(params2);
                FrameLayout frameLayout2=findViewById(R.id.frameLayout);
                frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(0 , 0));
                mapFragment2.getMapAsync(this);
                return true;
                case R.id.list_view:
                BBVAListFragment bbvaListFragment=new BBVAListFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("BBVA Details", bankDetails);
                bbvaListFragment.setArguments(bundle);

                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
                ViewGroup.LayoutParams params = mapFragment.getView().getLayoutParams();
                params.height = 0;
                params.width = 0;
                mapFragment.getView().setLayoutParams(params);
                FrameLayout frameLayout=findViewById(R.id.frameLayout);
                frameLayout.setLayoutParams(new LinearLayout.LayoutParams(1050 , 1550));

                getFragmentManager().beginTransaction().replace(R.id.frameLayout, bbvaListFragment).commit();
                return true;
        }
        return false;
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        ipresenter.onStart(getResources().getString(R.string.google_maps_key), mMap);
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(41.9047257, -88.3338299);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Current Location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.animateCamera( CameraUpdateFactory.newLatLngZoom ( new LatLng(41.9047257,-88.3338299), 15.0f ) );
    }

    public void showAllBBVA(GoogleMap googleMap, final double lat, double lon, String icon, String address, final BankDetails.ResultsBean resultsBean, BankDetails bankDetails){
        this.bankDetails = bankDetails;
        mMap = googleMap;
        Log.i("LatLog", "locations"+lat+", "+lon);
        LatLng sydney = new LatLng(lat, lon);
        Marker myMarker =   mMap.addMarker(new MarkerOptions().position(sydney).title("BBVA").snippet(address));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
            mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                @Override
                public void onInfoWindowClick(Marker marker) {

                    Intent locationDetails=new Intent(MapsActivity.this, LocationDetails.class);
                    locationDetails.putExtra("Name", resultsBean.getName());
                    locationDetails.putExtra("Address", resultsBean.getFormatted_address());
                    String openingHours="";
                    if(resultsBean.getOpening_hours()!=null)
                    for(int i=0;i<resultsBean.getOpening_hours().getWeekday_text().size();i++){
                        openingHours+=resultsBean.getOpening_hours().getWeekday_text().get(i)+"\n";
                    }
                    locationDetails.putExtra("Open hours", openingHours);
                    locationDetails.putExtra("Rating", resultsBean.getRating());
                    startActivity(locationDetails);
                }
            });

    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {
        myLocationUpdate();
    }

    private void myLocationUpdate() {
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                latitude=41.9047257;
                longitude=-88.3338299;
                mMap.animateCamera( CameraUpdateFactory.newLatLngZoom ( new LatLng(latitude,longitude), 8.0f ) );
            }
        });

    }


    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        googleApiClient.connect();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(googleApiClient.isConnected()){
            myLocationUpdate();
        }

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onStop() {
        super.onStop();
        googleApiClient.connect();
    }
}
