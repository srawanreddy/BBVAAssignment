package com.example.sravanreddy.bbvaassignment.mapactivity.ui;

import com.example.sravanreddy.bbvaassignment.mapactivity.data.model.BankDetails;
import com.google.android.gms.maps.GoogleMap;

public interface IView {
    public void showAllBBVA(GoogleMap googleMap, final double lat, double lon, String icon, String address, BankDetails.ResultsBean resultsBean, BankDetails bankDetails);
}
