package ru.qotofey.contractbridge.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import ru.qotofey.contractbridge.db.dao.ContractDao;
import ru.qotofey.contractbridge.db.entity.Contract;

@Database(entities = {Contract.class}, version = 0)
public abstract class AppDatabase extends RoomDatabase {

    public abstract ContractDao contractDao();


}
