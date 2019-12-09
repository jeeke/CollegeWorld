package com.collegeworld.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel(){
    lateinit var name : String
    lateinit var email : String
    lateinit var password : String
    var fromLoginPage : Boolean = false

    fun onButtonClicked(view : View){
        if(fromLoginPage){

        }else{

        }
    }

}