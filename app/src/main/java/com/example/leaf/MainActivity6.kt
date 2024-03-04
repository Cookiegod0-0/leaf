package com.example.leaf

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import android.net.Uri
import android.view.View
import android.widget.MediaController
import android.widget.VideoView

class MainActivity6 : AppCompatActivity() {
    lateinit var tb:Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        tb = findViewById(R.id.toolbar2)
        setSupportActionBar(this.tb)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Лотос"
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==android.R.id.home)
        {
            val inte=Intent(this, MainActivity5::class.java)
            startActivity(inte)
            finish()
        }
        return true
    }
}