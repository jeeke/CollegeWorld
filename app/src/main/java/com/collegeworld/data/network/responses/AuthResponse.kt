package com.collegeworld.data.network.responses

import com.collegeworld.data.db.entities.User

data class AuthResponse(
    val isSuccessful : Boolean?,
    val message: String?,
    val user: User?
)