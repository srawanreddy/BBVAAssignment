package com.example.sravanreddy.bbvaassignment.BBVAList;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sravanreddy.bbvaassignment.mapactivity.data.model.BankDetails;
import com.example.sravanreddy.bbvaassignment.R;

public class BBVAListAdapter extends RecyclerView.Adapter<BBVAListAdapter.MyViewHolder>{
private BankDetails bankDetails;

    public BBVAListAdapter(BankDetails bankDetails) {
        this.bankDetails = bankDetails;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.bbva_listview_adapter, null);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String address = bankDetails.getResults().get(position).getFormatted_address();
        double lat = bankDetails.getResults().get(position).getGeometry().getLocation().getLat();
        double lon = bankDetails.getResults().get(position).getGeometry().getLocation().getLng();
        holder.address.setText("Address: "+address);
        holder.latitue.setText("Latitude: "+lat);
        holder.longitude.setText("Longitude: "+lon);
    }

    @Override
    public int getItemCount() {
        return bankDetails.getResults().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
    TextView address, latitue, longitude;

        public MyViewHolder(View itemView) {
            super(itemView);
            address = itemView.findViewById(R.id.addressTV);
            latitue = itemView.findViewById(R.id.latitudeTV);
            longitude = itemView.findViewById(R.id.longitudeTV);
            latitue.setVisibility(View.VISIBLE);
        }
    }
}
