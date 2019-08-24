package com.hotel.hotelapp.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class HotelViewModel extends ViewModel {
    public MutableLiveData<String> mTitle = new MutableLiveData<>();
    public MutableLiveData<String> mRestaurantName = new MutableLiveData<>();
    public MutableLiveData<String> mRestaurantDetails = new MutableLiveData<>();
    public MutableLiveData<String> mContactDetails = new MutableLiveData<>();

    HotelViewModel() {
        mTitle.setValue("");
        mRestaurantName.setValue("Inka Restaurant");
        mRestaurantDetails.setValue("5.0(200+)| All days : 09:00 AM - 06:00 PM");
        mContactDetails.setValue("Reach us at : 9854562142");
    }

    public void onBookButtonClicked() {

    }

    public void onBackPressed() {

    }

    public void onMenuClicked() {
    }
}
