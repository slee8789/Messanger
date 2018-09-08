package com.leesc.messanger.viewmodel;

import android.arch.lifecycle.ViewModel;

import com.leesc.messanger.model.db.DataRepository;

import javax.inject.Inject;

public class LoginViewModel extends ViewModel {

    @Inject
    LoginViewModel(DataRepository repository) {

    }
}
