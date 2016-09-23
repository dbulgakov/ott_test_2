package com.dbulgakov.task2.other;

import android.app.Application;
import android.util.Log;

import com.dbulgakov.task2.other.di.AppComponent;
import com.dbulgakov.task2.other.di.DaggerAppComponent;


public class App extends Application {
    private static AppComponent component;

    public static AppComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = buildComponent();
    }

    protected AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .build();
    }
}
