package com.tictactoe.creatorinitials.ns

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val winner = intent.getStringExtra("pl")
        if(winner=="noone"){
            val complete = findViewById<TextView>(R.id.textView)
            complete.text="IT'S A DRAW!!"
        }
        else {
            val complete = findViewById<TextView>(R.id.textView)
            complete.text = "CONGRATULATIONS\n$winner won!!"
        }
    }

    fun goo(view: View) {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}
