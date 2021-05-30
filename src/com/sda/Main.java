package com.sda;

public class Main {
    public static void main(String[] args) {
	// write your code here

        UserSingleton singleton = UserSingleton.getInstance();

        singleton.addName("Catalin");
        singleton.addName("Raul");
        singleton.addName("Mihai");

        singleton.printNames();

        System.out.println("-------------");

        // SdaEx - NU este SINGLETON!!!
        SdaEx sdaEx = new SdaEx();
        sdaEx.addNameSdaEx("Popescu");

        singleton.printNames();


    }
}
