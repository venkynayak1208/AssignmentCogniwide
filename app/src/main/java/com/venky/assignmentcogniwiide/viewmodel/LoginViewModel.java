package com.venky.assignmentcogniwiide.viewmodel;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.venky.assignmentcogniwiide.BR;
import com.venky.assignmentcogniwiide.model.User;
import com.venky.assignmentcogniwiide.view.LoginActivity;
import com.venky.assignmentcogniwiide.view.MovieActivity;

public class LoginViewModel extends ViewModel {

    public MutableLiveData<String> EmailAddress = new MutableLiveData<>();
    public MutableLiveData<String> Password = new MutableLiveData<>();
    private MutableLiveData<User> userMutableLiveData;

    public MutableLiveData<User> getUser() {
        if (userMutableLiveData == null) {
            userMutableLiveData = new MutableLiveData<>();
        }
        return userMutableLiveData;
    }

    public void onClick(View view) {
        User loginUser = new User(EmailAddress.getValue(), Password.getValue());
        userMutableLiveData.setValue(loginUser);

    }
}
   /* public boolean isInputDataValid() {
        return !TextUtils.isEmpty(getUserEmail()) && Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() && (getUserPassword().length() > 6 || getUserPassword().length() < 12) ;
    }*/