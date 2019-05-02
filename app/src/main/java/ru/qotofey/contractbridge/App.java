package ru.qotofey.contractbridge;

import android.app.Application;
import android.arch.persistence.room.Room;

import ru.qotofey.contractbridge.db.AppDatabase;

public class App extends Application {

    private AppDatabase mDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        mDatabase = Room
                .databaseBuilder(this, AppDatabase.class, "database")
                .build();
    }
}
