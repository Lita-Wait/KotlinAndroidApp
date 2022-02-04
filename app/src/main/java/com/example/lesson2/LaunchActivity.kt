package com.example.lesson2

import android.content.Intent
import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        val timer = object :CountDownTimer (3000,1000){
            override fun onTick(milisuntilFinished: Long) {

            }

            override fun onFinish() {
                val intent = Intent(this@LaunchActivity,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        timer.start()


    }
}