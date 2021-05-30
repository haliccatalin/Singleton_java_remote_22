package com.sda;

import java.util.ArrayList;
import java.util.List;

public class UserSingleton {
    private static UserSingleton instance;

    // proprietate pentru a stoca date
    private List<String> userNames;

    // contructor privat!
    private UserSingleton() {
        this.userNames = new ArrayList<>();
    }

    // metoda de accesare a instantei
    public static UserSingleton getInstance() {
        if(instance == null) {
            instance = new UserSingleton();
        }

        return instance;
    }

    public void addName(String name) {
        this.userNames.add(name);
    }

    public void printNames() {
//        Stream version
//        this.userNames.stream().forEach((String name) -> System.out.println(name));

        for(String name: this.userNames) {
            System.out.println(name);
        }
    }


}
