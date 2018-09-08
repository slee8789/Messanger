package com.leesc.messanger.model.db;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.leesc.messanger.model.data.Message;

import java.util.List;

@Dao
public interface MessageDao {

    @Query("SELECT * FROM Message")
    List<Message> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Message... messages);

    @Query("DELETE FROM Message WHERE id == :id")
    void delete(String id);

    @Query("DELETE FROM Message")
    void clear();

    @Query("SELECT * FROM Message WHERE id == :id")
    LiveData<Message> get(int id);
}
