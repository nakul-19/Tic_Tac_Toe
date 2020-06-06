package com.tictactoe.creatorinitials.ns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gamestart(view: View) {
        val pl1 = findViewById<EditText>(R.id.player1)
        val pl2 : EditText = findViewById(R.id.player2)
        var p1 = pl1.text.toString()
        if(p1 == "")
            p1 = "player 1"
        var p2 = pl2.text.toString()
        if(p2 == "")
            p2 = "player 2"
        val intent= Intent(this,SecondActivity::class.java)
        intent.putExtra("p1", p1)
        intent.putExtra("p2",p2)
        startActivity(intent)
    }
}
