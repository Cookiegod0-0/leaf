package com.example.leaf

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.SharedPreferences
import android.widget.EditText
import android.widget.Toast

class registration : AppCompatActivity() {
    var preff: SharedPreferences?=null
    lateinit var name:EditText
    lateinit var email:EditText
    lateinit var password: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)
        name = findViewById(R.id.nameText)
        email = findViewById(R.id.mailText)
        password = findViewById(R.id.passwordText)
        preff = getSharedPreferences("TABLE2", MODE_PRIVATE)
        name.setText(preff?.getString("key1",""))
        email.setText(preff?.getString("key2",""))
        password.setText(preff?.getString("key3",""))

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun saveData(name:String,mail:String,pass:String){
        val editor=preff?.edit()
        editor?.putString("key1", name)
        editor?.putString("key2", mail)
        editor?.putString("key3", pass)
        editor?.apply()
    }


    fun buttonRegistration(view: View){
        val value1:String=name.text.toString()
        val value2:String=email.text.toString()
        val value3:String=password.text.toString()
        saveData(value1,value2,value3)

        val intent = Intent(this@registration, MainActivity3::class.java)
        startActivity(intent)
        finish()
    }
}