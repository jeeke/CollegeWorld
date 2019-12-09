package com.collegeworld.data.repos

import com.collegeworld.data.network.MyApi
import com.collegeworld.data.network.SafeApiRequest
import com.collegeworld.data.network.responses.AuthResponse

class UserRepository : SafeApiRequest() {
    suspend fun userLogin(email: String, password: String): AuthResponse {
        return apiRequest {
            MyApi().userLogin(email, password)
        }
    }
}