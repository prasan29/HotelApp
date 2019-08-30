package com.hotel.hotelapp.viewmodel;

import android.app.Activity;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;

public class MenuItemViewModel extends ViewModel {
    private final Activity mActivity;
    public MutableLiveData<String> mNonVeg = new MutableLiveData<>();
    public MutableLiveData<String> mDining = new MutableLiveData<>();
    public MutableLiveData<Boolean> mIsNonVegVisible = new MutableLiveData<>();
    public MutableLiveData<Boolean> mIsDiningVisible = new MutableLiveData<>();
    public MutableLiveData<String> mMenuTitle = new MutableLiveData<>();
    public MutableLiveData<String> mMenuDescription = new MutableLiveData<>();
    public MutableLiveData<String> mRate = new MutableLiveData<>();
    public MutableLiveData<Boolean> mAddVisibility = new MutableLiveData<>();
    public MutableLiveData<Boolean> mIsQuantityVisible = new MutableLiveData<>();
    public MutableLiveData<Integer> mQuantity = new MutableLiveData<>();

    public MenuItemViewModel(Activity activity) {
        mActivity = activity;
        mIsQuantityVisible.setValue(false);
        mAddVisibility.setValue(true);
        mQuantity.setValue(0);

        mNonVeg.setValue("N");
        mDining.setValue("D");
    }

    public void onAddClicked() {
        mAddVisibility.setValue(false);
        mIsQuantityVisible.setValue(true);
        mQuantity.setValue(mQuantity.getValue() + 1);
        HotelViewModel hotelViewModel = ViewModelProviders.of((FragmentActivity) mActivity).get(
                HotelViewModel.class);
        hotelViewModel.mTotalQuantity.setValue(hotelViewModel.mTotalQuantity.getValue() + 1);
    }

    public void onPlusClicked() {
        mQuantity.setValue(mQuantity.getValue() + 1);
        HotelViewModel hotelViewModel = ViewModelProviders.of((FragmentActivity) mActivity).get(
                HotelViewModel.class);
        hotelViewModel.mTotalQuantity.setValue(hotelViewModel.mTotalQuantity.getValue() + 1);
    }

    public void onMinusClicked() {
        if (mQuantity.getValue() <= 1) {
            mAddVisibility.setValue(true);
            mQuantity.setValue(0);
        } else {
            mQuantity.setValue(mQuantity.getValue() - 1);
        }

        HotelViewModel hotelViewModel = ViewModelProviders.of((FragmentActivity) mActivity).get(
                HotelViewModel.class);
        hotelViewModel.mTotalQuantity.setValue(hotelViewModel.mTotalQuantity.getValue() - 1);
    }
}
