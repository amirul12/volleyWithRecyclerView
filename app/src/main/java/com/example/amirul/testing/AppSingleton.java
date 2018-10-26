package com.example.amirul.testing;

public class AppSingleton {
    private static final AppSingleton ourInstance = new AppSingleton();

    public static AppSingleton getInstance() {
        return ourInstance;
    }

    private AppSingleton() {
    }


}
