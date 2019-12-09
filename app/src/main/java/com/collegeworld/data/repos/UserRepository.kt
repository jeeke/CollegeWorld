package com.collegeworld.data.repos

import com.collegeworld.data.network.MyApi
import com.collegeworld.data.network.responses.AuthResponse
import retrofit2.Response

class UserRepository {
    suspend fun userLogin(email: String, password: String): Response<AuthResponse> {
        return MyApi().userLogin(email, password)
    }
}