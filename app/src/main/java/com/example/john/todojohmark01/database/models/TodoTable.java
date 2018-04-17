package com.example.john.todojohmark01.database.models;

import com.example.john.todojohmark01.database.TodoDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by John on 2/5/2018.
 */
@Table(database = TodoDatabase.class)

public class TodoTable extends BaseModel{

    @PrimaryKey(autoincrement = true)
    public long id;

    @Column
    public String nombre;

    @Column
    public String actividad;

    @Column
    public int estado;
}
