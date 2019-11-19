package com.crystrom.devicetracker;

import java.util.ArrayList;

public class UserNode {

    private String userName;
    private String password;
    private ArrayList<Device> devices = new ArrayList<Device>();
    private ArrayList<GeoFenceList> mGeoFenceLists=new ArrayList<>();

    public ArrayList<GeoFenceList> getGeoFenceLists() {
        return mGeoFenceLists;
    }

    public void setGeoFenceLists(ArrayList<GeoFenceList> geoFenceLists) {
        mGeoFenceLists = geoFenceLists;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<Device> devices) {
        this.devices = devices;
    }



    public UserNode(String userName, String password, ArrayList<Device> devices,ArrayList<GeoFenceList> mGeoFenceLists) {
        this.userName = userName;
        this.password = password;
        this.devices = devices;
        this.mGeoFenceLists=mGeoFenceLists;
    }

    public boolean equalsTo(UserNode user1){
        boolean b = true;

        if(!this.userName.equals(user1.getUserName())){
            b = false;
        }
        if(!this.password.equals(user1.getPassword())){
            b = false;
        }
        if(!this.devices.equals(user1.getDevices())){
            b = false;
        }



        return b;
    }

    public UserNode(){}
}
