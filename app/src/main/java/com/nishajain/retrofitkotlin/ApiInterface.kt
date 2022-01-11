package com.nishajain.retrofitkotlin

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("quotes")
    fun getQuotes(): Call<List<DataModel>>
}