package com.hotel.hotelapp.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MenuItemViewModel extends ViewModel {
    public MutableLiveData<String> mNonVeg = new MutableLiveData<>();
    public MutableLiveData<Boolean> mIsNonVegVisible = new MutableLiveData<>();
    public MutableLiveData<String> mDining = new MutableLiveData<>();
    public MutableLiveData<String> mIsDiningVisible = new MutableLiveData<>();
    public MutableLiveData<String> mMenuTitle = new MutableLiveData<>();
    public MutableLiveData<String> mMenuDescription = new MutableLiveData<>();
    public MutableLiveData<String> mRate = new MutableLiveData<>();
    public MutableLiveData<Boolean> mAddVisibility = new MutableLiveData<>();
    public MutableLiveData<Boolean> mIsQuantityVisible = new MutableLiveData<>();
    public MutableLiveData<Integer> mQuantity = new MutableLiveData<>();

    MenuItemViewModel() {
        mIsQuantityVisible.setValue(false);
        mAddVisibility.setValue(true);
        mQuantity.setValue(0);
    }

    public void onAddClicked() {
        mAddVisibility.setValue(false);
        mQuantity.setValue(mQuantity.getValue() + 1);
    }

    public void onPlusClicked() {
        mQuantity.setValue(mQuantity.getValue() + 1);
    }

    public void onMinusClicked() {
        if (mQuantity.getValue() < 1) {
            mAddVisibility.setValue(true);
        } else {
            mQuantity.setValue(mQuantity.getValue() - 1);
        }
    }
}
