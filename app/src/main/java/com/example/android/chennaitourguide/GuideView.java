package com.example.android.chennaitourguide;

public class GuideView {
    private int mImageId;
    private String mName;
    private String mLocation;
    private String mTime;

    public GuideView(int imageId, String name, String location, String time) {

        mImageId = imageId;
        mName = name;
        mLocation = location;
        mTime = time;

    }

    public int getmImageId() {
        return mImageId;
    }

    public String getmName() {
        return mName;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmTime() {
        return mTime;
    }
}
