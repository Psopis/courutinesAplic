package com.example.courutinesaplic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.m3o.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
   val refer = retrofit.create(com.example.courutinesaplic.referenceUser::class.java)
    override fun onCreate(savedInstanceState: Bundle?) {
        var login = findViewById<EditText>(R.id.editText1)
        var pass = findViewById<EditText>(R.id.editText2)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    findViewById<Button>(R.id.button).setOnClickListener(){
        MainScope().launch(Dispatchers.IO) {
            var userData = RegisterRequest(
                login.text.toString(),
                pass.text.toString(),
                "PsopASA6i"
            )

        val req = refer.register(userData)
            Log.d("Retrofit",req.request().url().toString())
            val result = req.execute().body().toString()
            Log.d("Retrofit",result)
        }

    }


    }
}