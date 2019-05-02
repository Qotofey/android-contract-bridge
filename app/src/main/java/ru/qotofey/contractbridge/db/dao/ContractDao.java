package ru.qotofey.contractbridge.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import ru.qotofey.contractbridge.db.entity.Contract;

@Dao
public interface ContractDao {

    @Query("SELECT * FROM contract")
    List<Contract> getAll();

    @Query("SELECT * FROM contract WHERE id = :id")
    Contract get(long id);

    @Insert
    void insert(Contract contract);

    @Update
    void update(Contract contract);

    @Delete
    void delete(Contract contract);


}
