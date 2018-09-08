package com.leesc.messanger.model.db;

import android.arch.lifecycle.MutableLiveData;

import com.leesc.messanger.core.AppSchedulerProvider;
import com.leesc.messanger.core.base.BaseViewModel;
import com.leesc.messanger.model.api.Api;
import com.leesc.messanger.model.data.Message;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;


/**
 * @author ihsan on 12/28/17.
 */

public class DataRepository implements BaseViewModel {

    private final List<Message> messageList;
    private CompositeDisposable disposables = new CompositeDisposable();
    private final Api api;
    private final MutableLiveData<List<Message>> messageMutableLiveData;
    private final AppSchedulerProvider schedulerProvider;
    private final MessageDao messageDao;

    @Inject
    DataRepository(AppDatabase database, Api api, AppSchedulerProvider schedulerProvider) {
        this.api = api;
        this.schedulerProvider = schedulerProvider;
        messageDao = database.messageDao();
        messageList = messageDao.getAll();
        messageMutableLiveData = new MutableLiveData<>();
        messageMutableLiveData.postValue(messageList);
    }

    public void insertMessage(Message item) {
        messageDao.insert(item);
    }

    public void deleteSource(String id) {
        messageDao.delete(id);
    }

    @Override
    public void onClear() {
        disposables.clear();
    }
}
