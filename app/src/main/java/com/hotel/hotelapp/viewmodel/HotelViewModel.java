package com.hotel.hotelapp.viewmodel;

import android.app.Activity;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class HotelViewModel extends ViewModel {
    public MutableLiveData<String> mTitle = new MutableLiveData<>();
    public MutableLiveData<String> mRestaurantName = new MutableLiveData<>();
    public MutableLiveData<String> mRestaurantDetails = new MutableLiveData<>();
    public MutableLiveData<String> mContactDetails = new MutableLiveData<>();
    public MutableLiveData<Integer> mTotalQuantity = new MutableLiveData<>();
    private Activity mActivity;

    public HotelViewModel() {
        mTitle.setValue("");
        mRestaurantName.setValue("Inka Restaurant");
        mRestaurantDetails.setValue("5.0(200+)| All days : 09:00 AM - 06:00 PM");
        mContactDetails.setValue("Reach us at : 9854562142");
        mTotalQuantity.setValue(0);
    }

    public void setActivity(Activity activity) {
        mActivity = activity;
    }

    public void onBookButtonClicked() {

    }

    public void onBackPressed() {
        mActivity.onBackPressed();
    }

    public void onMenuClicked() {
    }
}
