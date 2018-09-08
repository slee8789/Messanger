package com.leesc.messanger.model.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.leesc.messanger.model.data.Message;

@Database(entities = {Message.class/*, Article.class*/}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MessageDao messageDao();

//    public abstract ArticleDao articleDao();
}
