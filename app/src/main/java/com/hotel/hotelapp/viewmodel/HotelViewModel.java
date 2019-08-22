package com.hotel.hotelapp.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class HotelViewModel extends ViewModel {
    public MutableLiveData<String> mTitle = new MutableLiveData<>();
}
