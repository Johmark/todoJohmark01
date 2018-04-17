package com.example.john.todojohmark01.database;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by John on 2/5/2018.
 */
@Database(name = TodoDatabase.NAME, version = TodoDatabase.VERSION)
public class TodoDatabase {
    public static final String NAME = "todoJohmark01";
    public static final int VERSION = 2;
}
