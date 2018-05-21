package com.example.sravanreddy.bbvaassignment.mapactivity.presenter;

import android.util.Log;

import com.example.sravanreddy.bbvaassignment.mapactivity.data.model.BankDetails;
import com.example.sravanreddy.bbvaassignment.mapactivity.data.network.APIService;
import com.example.sravanreddy.bbvaassignment.mapactivity.data.network.RetrofitClass;
import com.example.sravanreddy.bbvaassignment.mapactivity.ui.IView;
import com.example.sravanreddy.bbvaassignment.mapactivity.ui.MapsActivity;
import com.google.android.gms.maps.GoogleMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Persenter implements IPresenter {
    private IView iView;
    private BankDetails bankDetails;
    public Persenter(MapsActivity mapsActivity) {
        iView = mapsActivity;
        bankDetails = new BankDetails();
    }

    @Override
    public void onStart(String API_Key, final GoogleMap mMap) {

        APIService apiService= RetrofitClass.getRetrofitInstance().create(APIService.class);
        Call<BankDetails> retrofitCall=apiService.getBBVADetails("BBVA+Compass","41.9047257,-88.3338299","100", API_Key);
        retrofitCall.enqueue(new Callback<BankDetails>() {
            @Override
            public void onResponse(Call<BankDetails> call, Response<BankDetails> response) {
                bankDetails =response.body();
                Log.i("Response", "URL : "+response.raw().request().url());
                Log.i("Response size", "Size: "+ bankDetails.getResults().size());
                for(int i = 0; i< bankDetails.getResults().size(); i++){
                   iView.showAllBBVA(mMap, bankDetails.getResults().get(i).getGeometry().getLocation().getLat(), bankDetails.getResults().get(i).getGeometry().getLocation().getLng(), bankDetails.getResults().get(i).getIcon(), bankDetails.getResults().get(i).getFormatted_address(), bankDetails.getResults().get(i), bankDetails);
                }
            }

            @Override
            public void onFailure(Call<BankDetails> call, Throwable t) {
                Log.i("Response", t.getMessage());
            }
        });
    }
}
