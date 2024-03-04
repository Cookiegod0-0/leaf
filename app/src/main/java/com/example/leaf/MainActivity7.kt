package com.example.leaf

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.SharedPreferences
import android.widget.EditText

class MainActivity7 : AppCompatActivity() {
//    var preff: SharedPreferences?=null
//    lateinit var nickname:EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
//        nickname= findViewById(R.id.nickname)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
    }
}