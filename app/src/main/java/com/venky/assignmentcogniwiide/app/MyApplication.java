package com.venky.assignmentcogniwiide.app;

import android.app.Application;

import com.venky.assignmentcogniwiide.component.ApiComponent;
import com.venky.assignmentcogniwiide.component.DaggerApiComponent;
import com.venky.assignmentcogniwiide.module.ApiClientModule;
import com.venky.assignmentcogniwiide.module.AppModule;
import com.venky.assignmentcogniwiide.util.Constant;


public class MyApplication extends Application {

    public static ApiComponent mApiComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApiComponent = DaggerApiComponent.builder()
                .appModule(new AppModule(this))
                .apiClientModule(new ApiClientModule(Constant.Api.BASE_URL))
                .build();
    }

    public static ApiComponent getComponent() {
        return mApiComponent;
    }
}