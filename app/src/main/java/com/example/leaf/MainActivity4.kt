package com.example.leaf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.tabs.TabLayout

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val bn=findViewById<BottomNavigationView>(R.id.navi1)
        bn.selectedItemId=R.id.navhome
        bn.setOnItemSelectedListener{
            when (it.itemId) {
                R.id.navhome->{
                    Toast.makeText(this,"Работает 1", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@MainActivity4, MainActivity2::class.java)
                    startActivity(intent)
                    finish()
                }
                R.id.navfav->{

                    Toast.makeText(this,"Работает 2", Toast.LENGTH_SHORT).show()
                }
                R.id.navsett->{

                    Toast.makeText(this,"Работает 3", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }

        val feel: RecyclerView = findViewById((R.id.recycler))
        feel.adapter=Feel_adapter(this,FeelList().list2)

        val news: RecyclerView = findViewById((R.id.recyc))
        news.adapter=News_adapter(this,NewsList().list)


    }

    fun Next(view: View){
        val intent = Intent(this@MainActivity4, MainActivity5::class.java)
        startActivity(intent)
        finish()
    }

}