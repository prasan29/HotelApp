package com.hotel.hotelapp.datastore;

public class Menus {
    private String mTitle;
    private String mDescription;
    private int mRate;
    private boolean mIsNonVeg;
    private boolean mIsDining;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public boolean isNonVeg() {
        return mIsNonVeg;
    }

    public void setNonVeg(boolean nonVeg) {
        mIsNonVeg = nonVeg;
    }

    public boolean isDining() {
        return mIsDining;
    }

    public void setDining(boolean dining) {
        mIsDining = dining;
    }

    public int getRate() {
        return mRate;
    }

    public void setRate(int rate) {
        mRate = rate;
    }
}
