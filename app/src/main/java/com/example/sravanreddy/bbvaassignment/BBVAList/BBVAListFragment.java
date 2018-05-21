package com.example.sravanreddy.bbvaassignment.BBVAList;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sravanreddy.bbvaassignment.mapactivity.data.model.BankDetails;
import com.example.sravanreddy.bbvaassignment.R;

public class BBVAListFragment extends Fragment {
private RecyclerView recyclerView;
private BankDetails bankDetails;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
      View view =  inflater.inflate(R.layout.bbva_listview_fragment_layout, null);
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        bankDetails = (BankDetails) getArguments().getSerializable("BBVA Details");
        BBVAListAdapter adapter = new BBVAListAdapter(bankDetails);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
