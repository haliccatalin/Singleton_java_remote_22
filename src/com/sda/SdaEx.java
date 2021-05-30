package com.sda;

public class SdaEx {
    private UserSingleton singleton;

    public SdaEx() {
        this.singleton = UserSingleton.getInstance();
    }

    public void addNameSdaEx(String name) {
        this.singleton.addName(name);
    }
}
