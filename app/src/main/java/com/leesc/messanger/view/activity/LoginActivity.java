package com.leesc.messanger.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.leesc.messanger.R;
import com.leesc.messanger.core.BaseActivity;
import com.leesc.messanger.databinding.ActivityLoginBinding;
import com.leesc.messanger.viewmodel.LoginViewModel;

public class LoginActivity extends BaseActivity<LoginViewModel, ActivityLoginBinding> {

    @Override
    protected Class<LoginViewModel> getViewModel() {
        return LoginViewModel.class;
    }

    @Override
    protected void onCreate(Bundle instance, LoginViewModel viewModel, ActivityLoginBinding binding) {

    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_login;
    }


}

