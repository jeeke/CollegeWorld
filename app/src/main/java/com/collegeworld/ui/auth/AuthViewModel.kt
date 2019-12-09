package com.collegeworld.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.collegeworld.data.repos.UserRepository
import com.collegeworld.util.Coroutines

class AuthViewModel : ViewModel(){
    var name : String = ""
    var email : String = ""
    var password : String = ""
    var fromLoginPage : Boolean = false
    var authListener : AuthListener? = null

    fun onButtonClicked(view : View){
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFailure("Email or Password can't be empty")
            return
        }

        Coroutines.main{
            val loginResponse = UserRepository().userLogin(email,password)
            if(loginResponse.isSuccessful){
                authListener?.onSuccess(loginResponse.body()?.user!!)
            }else {
                authListener?.onFailure("Error code : ${loginResponse.code()}")
            }
        }
    }

}