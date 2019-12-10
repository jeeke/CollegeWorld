package com.collegeworld.ui.home.quotes

import androidx.lifecycle.ViewModel;
import com.collegeworld.data.repos.QuotesRepository
import com.collegeworld.util.lazyDeferred

class QuotesViewModel(
    repository: QuotesRepository
) : ViewModel() {

    val quotes by lazyDeferred {
        repository.getQuotes()
    }
}
