package com.example.leaf

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import android.net.Uri
import android.view.Menu
import android.view.View
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class MainActivity5 : AppCompatActivity() {
    lateinit var tb:Toolbar
      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

//        val video:VideoView=findViewById(R.id.videoView)
//        val mediaController=MediaController(this)
//        mediaController.setAnchorView(video)
//        val onLineurl= Uri.parse("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4 ")
//        video.setMediaController(mediaController)
//        video.setVideoURI(onLineurl)
//        video.requestFocus()
//        video.start()

          val video:VideoView=findViewById(R.id.videoView)
          val mediaController=MediaController(this)
          mediaController.setAnchorView(video)
          val onLineurl= Uri.parse("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4 ")
//          val offl=Uri.parse("android.resource://$packageName/${R.raw.meinteil}")
          video.setMediaController(mediaController)
//          video.setVideoURI(offl)
          video.requestFocus()
          video.start()


        tb=findViewById(R.id.toolbar)
        setSupportActionBar(this.tb)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="Лотос"

        val kadr: RecyclerView = findViewById((R.id.recyclerView3))
        kadr.adapter=kadr_adapter(this,Kadrlist().list3)

        val Rammstein: RecyclerView = findViewById((R.id.recyclerView4))
        Rammstein.adapter=Rammstein_adapter(this,RammsteinList().list4)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            android.R.id.home -> {
                val inte = Intent(this, MainActivity4::class.java)
                startActivity(inte)
                finish()
            }
            R.id.one -> {
                Toast.makeText(this, "работает", Toast.LENGTH_SHORT).show()
            }
            R.id.two -> {
                val intent2 = Intent(this@MainActivity5, MainActivity3::class.java)
                startActivity(intent2)
                finish()
            }
            R.id.three -> {
                val intent3 = Intent(this@MainActivity5, MainActivity7::class.java)
                startActivity(intent3)
                finish()
            }
        }
        return true
    }

    fun Next2(view: View){
        val intent = Intent(this@MainActivity5, MainActivity6::class.java)
        startActivity(intent)
        finish()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        return true
    }
}