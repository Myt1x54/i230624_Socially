package com.abdulmoiz.i230624

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class explorepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_explorepage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val searchbutton = findViewById<EditText>(R.id.searchbar)

        searchbutton.setOnClickListener {
            val intent = Intent(this, searchpage::class.java)
            startActivity(intent)
        }

        val homebutton = findViewById<ImageView>(R.id.navhome)

        homebutton.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
            finish()
        }

        val addbutton = findViewById<ImageView>(R.id.navadd)

        addbutton.setOnClickListener {
            val intent = Intent(this, uploadpics::class.java)
            startActivity(intent)
        }

        val heartbutton = findViewById<ImageView>(R.id.navheart)

        heartbutton.setOnClickListener {
            val intent = Intent(this, heartfollowing::class.java)
            startActivity(intent)
        }

        val profilebutton = findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.navprofile)

        profilebutton.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
    }
}