package com.example.leaf

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.regex.Pattern
const val TABLEE = "TABLEE"
const val CHECK = "KEY4"

class MainActivity3 : AppCompatActivity() {
    val pattern = ("[a-z]{1,100}" + "@" + "[a-z]{1,6}" + "\\." + "[a-z]{1,3}")
    var preff: SharedPreferences?=null
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var check:CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        email = findViewById(R.id.editemail)
        password = findViewById(R.id.editpass)
        check = findViewById(R.id.checkBox)
        preff = getSharedPreferences("TABLEE", MODE_PRIVATE)
        check.isChecked=preff?.getBoolean("key3",false)?:false
        email.setText(preff?.getString("key1",""))
        password.setText(preff?.getString("key2",""))
    }
    fun savestate(check:Boolean) {
        val editor=preff?.edit()
        editor?.putBoolean("key3", check)
        editor?.apply()
    }

    fun saveData(mail:String,pass:String){
        val editor=preff?.edit()
        editor?.putString("key1", mail)
            editor?.putString("key2", pass)
        editor?.apply()
    }

    fun deleteAll(){
        val editor=preff?.edit()
        editor?.clear()
        editor?.apply()
    }

    fun emailValid(text:String):Boolean {
        return Pattern.compile(pattern).matcher(text).matches()
    }

//    fun but(view: View) {
//        if (email.text.toString().isEmpty()||pass.text.toString().isEmpty()) {
//            Toast.makeText(this, "Поле не заполнено", Toast.LENGTH_SHORT).show()
//        }
//        if (email.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty())
//        {
//            Toast.makeText(this, "Успешно", Toast.LENGTH_LONG).show()
//            if (emailValid(email.text.toString()))
//            {
//                val intent = Intent(this@MainActivity3, MainActivity4::class.java)
//                startActivity(intent)
//                finish()
//            }
//            else {
//                Toast.makeText(this, "Ошибка", Toast.LENGTH_SHORT).show()
//            }
//        }
//        else {
//            val alert = AlertDialog.Builder(this)
//        }
//    }
fun but(view: View){
    val value:String=email.text.toString()
        val value2:String=password.text.toString()
        val checkboxstate:Boolean=check.isChecked
        if (checkboxstate==true){
          saveData(value,value2)
          savestate(checkboxstate)
       }
        else {
           deleteAll()
      }
    val intent = Intent(this@MainActivity3, MainActivity7::class.java)
    startActivity(intent)
    finish()
}
}