package com.collegeworld.ui.home.profile

import androidx.lifecycle.ViewModel;
import com.collegeworld.data.repos.UserRepository

class ProfileViewModel(
    repository: UserRepository
) : ViewModel() {

    val user = repository.getUser()

}
