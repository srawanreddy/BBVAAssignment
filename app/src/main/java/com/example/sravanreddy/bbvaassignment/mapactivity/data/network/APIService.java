package com.example.sravanreddy.bbvaassignment.mapactivity.data.network;

import com.example.sravanreddy.bbvaassignment.mapactivity.data.model.BankDetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    @GET("textsearch/json")
    Call<BankDetails> getBBVADetails(@Query("query") String query, @Query("location") String location, @Query("radius") String radius, @Query("key") String key);
}
