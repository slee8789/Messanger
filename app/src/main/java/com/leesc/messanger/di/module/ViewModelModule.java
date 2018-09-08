package com.leesc.messanger.di.module;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;


import com.leesc.messanger.di.ViewModelKey;
import com.leesc.messanger.viewmodel.LoginViewModel;
import com.leesc.messanger.viewmodel.SplashViewModel;
import com.leesc.messanger.viewmodel.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * @author ihsan on 12/27/17.
 */

@SuppressWarnings("WeakerAccess")
@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel.class)
    abstract ViewModel bindsLoginViewModel(LoginViewModel loginViewModel);

//    @Binds
//    @IntoMap
//    @ViewModelKey(SplashViewModel.class)
//    abstract ViewModel bindsSplashViewModel(SplashViewModel splashViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindsViewModelFactory(ViewModelFactory viewModelFactory);

}
