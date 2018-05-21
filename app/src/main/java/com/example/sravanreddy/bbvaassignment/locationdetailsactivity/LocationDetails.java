package com.example.sravanreddy.bbvaassignment.locationdetailsactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sravanreddy.bbvaassignment.R;

public class LocationDetails extends AppCompatActivity {
private TextView name, address, openingHours, rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_details);
        name=findViewById(R.id.details_nameTV);
        address = findViewById(R.id.details_addressTV);
        openingHours = findViewById(R.id.details_openinghoursTV);
        rating = findViewById(R.id.details_rating);
        name.setText(getIntent().getExtras().getString("Name"));
        address.setText(getIntent().getExtras().getString("Address"));
        String opening_Hours="Opening Hours: \n";
        //NO SETTING DATA IN VIEW
        opening_Hours+= getIntent().getExtras().getString("Open hours");
        openingHours.setText(opening_Hours);
        rating.setText(getIntent().getExtras().getDouble("Rating")+"/5");
    }
}
