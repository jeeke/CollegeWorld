package com.collegeworld.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.collegeworld.R
import com.collegeworld.databinding.ActivityAuthBinding
import com.collegeworld.util.toast

class AuthActivity : AppCompatActivity() , AuthListener{

    override fun onSuccess(loginResponse: LiveData<String>) {
        loginResponse.observe(this , Observer { toast(it) })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //implement library lifecycle extensions
        val binding : ActivityAuthBinding = DataBindingUtil.setContentView(this,R.layout.activity_auth)
        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewModel
        viewModel.authListener = this

    }

    override fun onFailure(message : String) {
       toast(message)
    }
}
