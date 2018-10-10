package com.example.wolverine.tourapp;

/**
 * Created by wolverine on 27/07/18.
 */

public class Monument {

    private String mMonumentName;
    private String mDescription;
    private int mImageId;
    private String mBuildername = "UnKnown";

    public Monument(String monumentName, String Description, int image_Id) {
        mMonumentName = monumentName;
        mDescription = Description;
        mImageId = image_Id;
    }

    public Monument(String monumentName, String Description, String Buildername, int image_Id) {
        mMonumentName = monumentName;
        mDescription = Description;
        mImageId = image_Id;
        mBuildername = Buildername;
    }

    public String getmMonumentName() {
        return mMonumentName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int getmImageId() {
        return mImageId;
    }

    public String getmBuildername() {
        return mBuildername;
    }
}
