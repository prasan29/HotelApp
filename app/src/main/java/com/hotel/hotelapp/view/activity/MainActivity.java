package com.hotel.hotelapp.view.activity;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hotel.hotelapp.R;
import com.hotel.hotelapp.databinding.ActivityMainBinding;
import com.hotel.hotelapp.view.adapter.HotelMenuAdapter;
import com.hotel.hotelapp.viewmodel.HotelViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        HotelViewModel hotelViewModel = ViewModelProviders.of(this).get(HotelViewModel.class);

        List<String> list = populateListData();

        HotelMenuAdapter adapter = new HotelMenuAdapter(list);

        mBinding.setViewModel(hotelViewModel);

//        recyclerView.setAdapter(adapter);

        mBinding.setLifecycleOwner(this);

        mBinding.setAdapter(adapter);

    }

    private List<String> populateListData() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("" + i);
        }

        return list;
    }
}
