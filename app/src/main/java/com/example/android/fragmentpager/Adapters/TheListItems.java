package com.example.android.fragmentpager.Adapters;

/**
 * Created by Ahmad Siafaddin on 10/15/2017.
 */

public class TheListItems {
    private String name;
    private String location;
    private int ImageResourec;

    public TheListItems(String name, String location, int imageResourec) {
        this.name = name;
        this.location = location;
        ImageResourec = imageResourec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImageResourec() {
        return ImageResourec;
    }

    public void setImageResourec(int imageResourec) {
        ImageResourec = imageResourec;
    }
}
