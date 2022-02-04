package com.example.lesson2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern.compile

class SignInActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var textview: TextView
    lateinit var pattern: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        textview = findViewById(R.id.textView6)
        pattern = "[a-z]{1,50}" +
                "\\@" +
                "[a-z]{1,15}" +
                "\\." +
                "[a-z]{1,8}"
    }



    fun signIn(view: android.view.View)
    {
        if(email.text.isNotEmpty() && password.text.isNotEmpty())
        {
            val valid = compile(pattern).matcher(email.text.toString()).matches()
            //val valid = true
            if(valid)
            {
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
            }
            else {
                val alert2 = AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("Ошибка в поле email")
                    .setPositiveButton("Ok", null)
                    .create()
                    .show()
            }
        }
        else {
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("Ok", null)
                .create()
                .show()
        }
    }
}