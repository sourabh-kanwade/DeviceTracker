package com.crystrom.devicetracker.Interfaces;

import com.crystrom.devicetracker.MyLatLang;

import java.util.ArrayList;


public interface IOnLoadLocationListener {
    void onLoadLocationSuccess(ArrayList<MyLatLang> latLngs);
    void onLoadLocationFailed(String message);
}
