package com.leesc.messanger.di;

import com.leesc.messanger.view.activity.LoginActivity;
import com.leesc.messanger.view.activity.SplashActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author ihsan on 12/2/17.
 */

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract LoginActivity bindLoginActivity();

    @ContributesAndroidInjector
    abstract SplashActivity bindSplashActivity();

}
