package com.example.john.todojohmark01.database;

import com.example.john.todojohmark01.database.models.TodoTable;
import com.raizlabs.android.dbflow.annotation.Migration;
import com.raizlabs.android.dbflow.sql.SQLiteType;
import com.raizlabs.android.dbflow.sql.migration.AlterTableMigration;

/**
 * Created by John on 2/26/2018.
 */
@Migration(version = 3, database = TodoDatabase.class)


public class Migracion1 extends AlterTableMigration<TodoTable> {

    public Migracion1(Class<TodoTable> table) {
        super(table);
    }

    @Override
    public void onPreMigrate() {
        super.onPreMigrate();
        addColumn(SQLiteType.INTEGER,"estado");
    }
}
