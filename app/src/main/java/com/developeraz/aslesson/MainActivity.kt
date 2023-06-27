package com.developeraz.aslesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtASL = findViewById<TextView>(R.id.textView)
        val btnASL = findViewById<Button>(R.id.button)
        txtASL.text = "Application"
        btnASL.text = "Dont push"
    }
    fun onClickButton(view: View) {
        val txtASL = findViewById<TextView>(R.id.textView)
        txtASL.text = "You did not listen me!"
        txtASL.textSize = 30F
        val btnASL = findViewById<Button>(R.id.button)
        counter++
        btnASL.text = counter.toString()
    }


}