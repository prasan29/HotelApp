package com.hotel.hotelapp.view.activity;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hotel.hotelapp.R;
import com.hotel.hotelapp.databinding.ActivityMainBinding;
import com.hotel.hotelapp.datastore.DataStore;
import com.hotel.hotelapp.view.adapter.HotelMenuAdapter;
import com.hotel.hotelapp.viewmodel.HotelViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mBinding.setLifecycleOwner(this);

        HotelViewModel hotelViewModel = ViewModelProviders.of(this).get(HotelViewModel.class);

        HotelMenuAdapter adapter = new HotelMenuAdapter(DataStore.populateData(), this,
                this);

        mBinding.setViewModel(hotelViewModel);

        mBinding.setLifecycleOwner(this);

        mBinding.setAdapter(adapter);
    }

}
