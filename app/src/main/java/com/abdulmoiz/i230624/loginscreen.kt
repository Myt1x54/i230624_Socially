package com.abdulmoiz.i230624

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class loginscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_loginscreen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val signupbutton = findViewById<TextView>(R.id.signup)

        signupbutton.setOnClickListener {

            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
            finish()
        }


        val loginbutton = findViewById<Button>(R.id.loginbutton)

        loginbutton.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
            finish()
        }


        val backbutton = findViewById<ImageView>(R.id.backarrow)

        backbutton.setOnClickListener {

            val intent = Intent(this, changeaccount::class.java)
            startActivity(intent)
            finish()
        }





    }
}