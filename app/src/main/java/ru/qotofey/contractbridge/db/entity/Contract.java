package ru.qotofey.contractbridge.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Contract {

    @PrimaryKey
    public long id;

    public String name;
    public String description;
//    public String coordinates;

}
