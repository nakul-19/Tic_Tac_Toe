package com.tictactoe.creatorinitials.ns

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val winner = intent.getStringExtra("pl")
        if (winner == "noone") {
            val complete = findViewById<TextView>(R.id.textView)
            complete.text = "IT'S A DRAW!!"
        } else {
            val complete = findViewById<TextView>(R.id.textView)
            complete.text = "CONGRATULATIONS\n$winner won!!"
        }
    }

    fun goo(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
        startActivity(intent)
    }
}
