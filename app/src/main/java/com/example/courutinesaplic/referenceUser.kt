package com.example.courutinesaplic

import android.service.autofill.UserData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface referenceUser {
    @POST("/v1/user/Create")
    @Headers("Authorization: Bearer MzVjOTIzMDUtNzM5Ni00MjE4LWJiYTAtYWE3NjM2NDNhMDhl")
    fun register(
        @Body userData: RegisterRequest
    ): Call<RegisterRequest>
}