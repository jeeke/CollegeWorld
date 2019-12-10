package com.collegeworld.data.network.responses

import com.collegeworld.data.db.entities.Quote


data class QuotesResponse (
    val isSuccessful: Boolean,
    val quotes: List<Quote>
)