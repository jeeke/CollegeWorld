package com.collegeworld.ui.auth

import com.collegeworld.data.db.entities.User
import com.collegeworld.data.network.responses.AuthResponse
import retrofit2.Response

interface AuthListener{
    fun onFailure(message : String)
    fun onSuccess(user: User)
}