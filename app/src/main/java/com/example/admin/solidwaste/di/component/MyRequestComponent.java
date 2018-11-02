package com.example.admin.solidwaste.di.component;

import com.example.admin.solidwaste.activity.MyRequestActivity;
import com.example.admin.solidwaste.di.module.MyRequestPresenterModule;
import com.example.admin.solidwaste.di.module.NetworkClient;
import com.example.admin.solidwaste.sharedprefshelper.SharedPrefModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Murugan on 11-10-2018.
 */
@Singleton
@Component(modules = {MyRequestPresenterModule.class, NetworkClient.class, SharedPrefModule.class})
public interface MyRequestComponent {
    void inject(MyRequestActivity myRequestActivity);

}


