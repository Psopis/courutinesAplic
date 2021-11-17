package com.example.courutinesaplic

import android.service.autofill.UserData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface referenceUser {
    @POST("/v1/user/Create")
    @Headers("Authorization: Bearer MTUyYjdjNjMtN2U3YS00OTI3LWFkMzUtZDNmNzI3YjdlYjkz")
    fun register(
        @Body userData: RegisterRequest
    ): Call<RegisterRequest>
}