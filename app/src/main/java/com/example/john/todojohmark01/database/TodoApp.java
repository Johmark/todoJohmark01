package com.example.john.todojohmark01.database;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by John on 2/5/2018.
 */

public class TodoApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
        }
    }
