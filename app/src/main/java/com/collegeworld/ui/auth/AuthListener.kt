package com.collegeworld.ui.auth

import androidx.lifecycle.LiveData

interface AuthListener{
    fun onSuccess(loginResponse: LiveData<String>)
    fun onFailure(message : String)
}