package com.example.rahul.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LocationPost {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("loc")
    @Expose
    private String loc;
    @SerializedName("time")
    @Expose
    private Integer time;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
