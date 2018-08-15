package com.leesc.messanger;

import com.leesc.messanger.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class MessangerApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends dagger.android.support.DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
