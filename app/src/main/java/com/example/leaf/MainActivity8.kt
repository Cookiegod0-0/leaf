package com.example.leaf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MainActivity8 : AppCompatActivity() {
    lateinit var tl:TabLayout
    lateinit var vp:ViewPager2
    lateinit var bn:BottomNavigationView
    private val fraglist= listOf(Fragment1(), Fragment2(), Fragment3())
    private val fraglist2= listOf(Fragment1(), Fragment2(), Fragment3())
    private val tablist= listOf("В тренде","Новое","Для Вас")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)
        tl=findViewById(R.id.tabLayout)
        vp=findViewById(R.id.fragmentholder)
        val adapter=viewadapter(this,fraglist2)
        vp.adapter=adapter
        TabLayoutMediator(tl,vp){
                tab,pos ->tab.text=tablist[pos]
        }.attach()
//        val bn=findViewById<BottomNavigationView>(R.id.navi2)

        bn=findViewById(R.id.navi2)
//        bn.selectedItemId=R.id.navhome
        supportFragmentManager.beginTransaction().replace(R.id.framefr, fraglist[1]).commit()

        bn.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.navhome->{
                    supportFragmentManager.beginTransaction().replace(R.id.framefr, fraglist[0]).commit()
                    Toast.makeText(this,"Работает 1", Toast.LENGTH_SHORT).show()
                }
                R.id.navfav->{
                    supportFragmentManager.beginTransaction().replace(R.id.framefr, fraglist[1]).commit()
                    Toast.makeText(this,"Работает 2", Toast.LENGTH_SHORT).show()
                }
                R.id.navsett->{
                    supportFragmentManager.beginTransaction().replace(R.id.framefr, fraglist[2]).commit()
                    Toast.makeText(this,"Работает 3", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }
}
