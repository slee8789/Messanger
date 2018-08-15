package com.leesc.messanger.di;

import com.leesc.messanger.MessangerApplication;
import com.leesc.messanger.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author ihsan on 12/2/17.
 */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class})
public interface AppComponent extends AndroidInjector<MessangerApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MessangerApplication> {
    }
}
