package com.tictactoe.creatorinitials.ns

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tictactoe.creatorinitials.ns.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        val p1 = intent.getStringExtra("p1")
        val d1 = "$p1 's turn"
        val t: TextView = binding.display //findViewById(R.id.display)
        t.text = d1
    }

    fun clicked(b: Button) {
        if (b.text == "") {
            val p1 = intent.getStringExtra("p1")
            val p2 = intent.getStringExtra("p2")
            val d1 = "$p1 's turn"
            val d2 = "$p2 's turn"
            val h = binding.display//findViewById<TextView>(R.id.display)
            val disp: String?
            if (h.text.toString() == d2) {
                b.text = "X"
                disp = d1
            } else {
                b.text = "O"
                disp = d2
            }
            h.text = disp
        }
    }

    fun doo(view: View) {
        clicked(view as Button)
        view.checkit()
    }

    fun Button.checkit() {
        val a: Boolean
        val b: Boolean
        val c: Boolean
        val d: Boolean
        when (this.id) {
            R.id.button11 -> {
                a = checkh1()
                b = checkv1()
                c = checkc1()
                if (a && b && c)
                    checkall()
            }
            R.id.button12 -> {
                a = checkh1()
                b = checkv2()
                if (a && b)
                    checkall()
            }
            R.id.button13 -> {
                a = checkh1()
                b = checkv3()
                c = checkc2()
                if (a && b && c)
                    checkall()
            }
            R.id.button21 -> {
                a = checkh2()
                b = checkv1()
                if (a && b)
                    checkall()
            }
            R.id.button22 -> {
                a = checkh2()
                b = checkc1()
                c = checkc2()
                d = checkv2()
                if (a && b && c && d)
                    checkall()
            }
            R.id.button23 -> {
                a = checkh2()
                b = checkv3()
                if (a && b)
                    checkall()
            }
            R.id.button31 -> {
                a = checkh3()
                b = checkv1()
                c = checkc2()
                if (a && b && c)
                    checkall()
            }
            R.id.button32 -> {
                a = checkh3()
                b = checkv2()
                if (a && b)
                    checkall()
            }
            R.id.button33 -> {
                a = checkh3()
                b = checkv3()
                c = checkc1()
                if (a && b && c)
                    checkall()
            }
        }
    }

    @SuppressLint("SetTextI18n")
    fun checkall() {
        var notblank: Button = binding.button11 //findViewById(R.id.button11)
        if (notblank.text.toString() == "")
            return
        notblank = binding.button12 //findViewById(R.id.button12)
        if (notblank.text.toString() == "")
            return
        notblank = binding.button13 //findViewById(R.id.button13)
        if (notblank.text.toString() == "")
            return
        notblank = binding.button21 //findViewById(R.id.button21)
        if (notblank.text.toString() == "")
            return
        notblank = binding.button22 //findViewById(R.id.button22)
        if (notblank.text.toString() == "")
            return
        notblank = binding.button23 //findViewById(R.id.button23)
        if (notblank.text.toString() == "")
            return
        notblank = binding.button31 //findViewById(R.id.button31)
        if (notblank.text.toString() == "")
            return
        notblank = binding.button32 //findViewById(R.id.button32)
        if (notblank.text.toString() == "")
            return
        notblank = binding.button33 //findViewById(R.id.button33)
        if (notblank.text.toString() == "")
            return
        //val dis : TextView = findViewById(R.id.display)
        //dis.text="IT 'S A DRAW"
        //val setit = findViewById<Button>(R.id.reset)
        //setit.text="click to RESET"
        val intent = Intent(this, ThirdActivity::class.java)
        intent.putExtra("pl", "noone")
        startActivity(intent)
    }

    @SuppressLint("SetTextI18n")
    fun checkh1(): Boolean {
        val a = binding.button11 //findViewById<Button>(R.id.button11)
        val b = binding.button12 //findViewById<Button>(R.id.button12)
        val c = binding.button13 //findViewById<Button>(R.id.button13)
        if ((a.text.toString() == b.text.toString()) && (b.text.toString() == c.text.toString()) && (a.text.toString() != "")) {
            val d = binding.display //findViewById<TextView>(R.id.display)
            val p1 = intent.getStringExtra("p1")
            val p2 = intent.getStringExtra("p2")
            val intent = Intent(this, ThirdActivity::class.java)
            val d1 = "$p1 's turn"
            val passingname: String?
            if (d.text.toString() == d1)
                passingname = p2
            else
                passingname = p1
            intent.putExtra("pl", passingname)
            startActivity(intent)
        } else
            return true
        return false
    }

    @SuppressLint("SetTextI18n")
    fun checkh2(): Boolean {
        val a = binding.button21 //findViewById<Button>(R.id.button21)
        val b = binding.button22 //findViewById<Button>(R.id.button22)
        val c = binding.button23 //findViewById<Button>(R.id.button23)
        if ((a.text.toString() == b.text.toString()) && (b.text.toString() == c.text.toString()) && (a.text.toString() != "")) {
            val d = binding.display //findViewById<TextView>(R.id.display)
            val p1 = intent.getStringExtra("p1")
            val p2 = intent.getStringExtra("p2")
            val intent = Intent(this, ThirdActivity::class.java)
            val d1 = "$p1 's turn"
            val passingname: String?
            if (d.text.toString() == d1)
                passingname = p2
            else
                passingname = p1
            intent.putExtra("pl", passingname)
            startActivity(intent)
        } else
            return true
        return false
    }

    @SuppressLint("SetTextI18n")
    fun checkh3(): Boolean {
        val a = binding.button31 //findViewById<Button>(R.id.button31)
        val b = binding.button32 //findViewById<Button>(R.id.button32)
        val c = binding.button33 //findViewById<Button>(R.id.button33)
        if ((a.text.toString() == b.text.toString()) && (b.text.toString() == c.text.toString()) && (a.text.toString() != "")) {
            val d = binding.display //findViewById<TextView>(R.id.display)
            val p1 = intent.getStringExtra("p1")
            val p2 = intent.getStringExtra("p2")
            val intent = Intent(this, ThirdActivity::class.java)
            val d1 = "$p1 's turn"
            val passingname: String?
            if (d.text.toString() == d1)
                passingname = p2
            else
                passingname = p1
            intent.putExtra("pl", passingname)
            startActivity(intent)
        } else
            return true
        return false
    }

    @SuppressLint("SetTextI18n")
    fun checkv1(): Boolean {
        val a = findViewById<Button>(R.id.button11)
        val b = findViewById<Button>(R.id.button21)
        val c = findViewById<Button>(R.id.button31)
        if ((a.text.toString() == b.text.toString()) && (b.text.toString() == c.text.toString()) && (a.text.toString() != "")) {
            val d = findViewById<TextView>(R.id.display)
            val p1 = intent.getStringExtra("p1")
            val p2 = intent.getStringExtra("p2")
            val intent = Intent(this, ThirdActivity::class.java)
            val d1 = "$p1 's turn"
            val passingname: String?
            if (d.text.toString() == d1)
                passingname = p2
            else
                passingname = p1
            intent.putExtra("pl", passingname)
            startActivity(intent)
        } else
            return true
        return false
    }

    @SuppressLint("SetTextI18n")
    fun checkv2(): Boolean {
        val a = binding.button12 //findViewById<Button>(R.id.button12)
        val b = binding.button22 //findViewById<Button>(R.id.button22)
        val c = binding.button32 //findViewById<Button>(R.id.button32)
        if ((a.text.toString() == b.text.toString()) && (b.text.toString() == c.text.toString()) && (a.text.toString() != "")) {
            val d = binding.display //findViewById<TextView>(R.id.display)
            val p1 = intent.getStringExtra("p1")
            val p2 = intent.getStringExtra("p2")
            val intent = Intent(this, ThirdActivity::class.java)
            val d1 = "$p1 's turn"
            val passingname: String?
            if (d.text.toString() == d1)
                passingname = p2
            else
                passingname = p1
            intent.putExtra("pl", passingname)
            startActivity(intent)
        } else
            return true
        return false
    }

    @SuppressLint("SetTextI18n")
    fun checkv3(): Boolean {
        val a = binding.button13 //findViewById<Button>(R.id.button13)
        val b = binding.button23 //findViewById<Button>(R.id.button23)
        val c = binding.button33 //findViewById<Button>(R.id.button33)
        if ((a.text.toString() == b.text.toString()) && (b.text.toString() == c.text.toString()) && (a.text.toString() != "")) {
            val d = binding.display //findViewById<TextView>(R.id.display)
            val p1 = intent.getStringExtra("p1")
            val p2 = intent.getStringExtra("p2")
            val intent = Intent(this, ThirdActivity::class.java)
            val d1 = "$p1 's turn"
            val passingname: String?
            if (d.text.toString() == d1)
                passingname = p2
            else
                passingname = p1
            intent.putExtra("pl", passingname)
            startActivity(intent)
        } else
            return true
        return false
    }

    @SuppressLint("SetTextI18n")
    fun checkc1(): Boolean {
        val a = binding.button11 //findViewById<Button>(R.id.button11)
        val b = binding.button22 //findViewById<Button>(R.id.button22)
        val c = binding.button33 //findViewById<Button>(R.id.button33)
        if ((a.text.toString() == b.text.toString()) && (b.text.toString() == c.text.toString()) && (a.text.toString() != "")) {
            val d = binding.display //findViewById<TextView>(R.id.display)
            val p1 = intent.getStringExtra("p1")
            val p2 = intent.getStringExtra("p2")
            val intent = Intent(this, ThirdActivity::class.java)
            val d1 = "$p1 's turn"
            val passingname: String?
            if (d.text.toString() == d1)
                passingname = p2
            else
                passingname = p1
            intent.putExtra("pl", passingname)
            startActivity(intent)
        } else
            return true
        return false
    }

    @SuppressLint("SetTextI18n")
    fun checkc2(): Boolean {
        val a = binding.button13 //findViewById<Button>(R.id.button13)
        val b = binding.button22 //findViewById<Button>(R.id.button22)
        val c = binding.button31 //findViewById<Button>(R.id.button31)
        if ((a.text.toString() == b.text.toString()) && (b.text.toString() == c.text.toString()) && (a.text.toString() != "")) {
            val d = binding.display //findViewById<TextView>(R.id.display)
            val p1 = intent.getStringExtra("p1")
            val p2 = intent.getStringExtra("p2")
            val intent = Intent(this, ThirdActivity::class.java)
            val d1 = "$p1 's turn"
            val passingname: String?
            if (d.text.toString() == d1)
                passingname = p2
            else
                passingname = p1
            intent.putExtra("pl", passingname)
            startActivity(intent)
        } else
            return true
        return false
    }

    fun back(view: View) {

        val p1 = intent.getStringExtra("p1")
        val d1 = "$p1 's turn"
        val t: TextView = binding.display //findViewById(R.id.display)
        t.text = d1

        binding.button11.text=""
        binding.button12.text=""
        binding.button13.text=""

        binding.button21.text=""
        binding.button22.text=""
        binding.button23.text=""

        binding.button31.text=""
        binding.button32.text=""
        binding.button33.text=""

    }
}
