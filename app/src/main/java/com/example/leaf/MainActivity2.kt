package com.example.leaf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun signIn(view: View){
        val intent = Intent(this@MainActivity2, MainActivity3::class.java)
        startActivity(intent)
        finish()
    }
}