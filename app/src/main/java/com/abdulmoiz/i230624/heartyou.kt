package com.abdulmoiz.i230624

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class heartyou : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heartyou)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val followingpagebutton = findViewById<TextView>(R.id.following_tab)

        followingpagebutton.setOnClickListener {
            val intent = Intent(this, heartfollowing::class.java)
            startActivity(intent)
            finish()
        }

        val homebutton = findViewById<ImageView>(R.id.navhome)

        homebutton.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
            finish()
        }

        val profilebutton = findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.navprofile)

        profilebutton.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        val explorebutton = findViewById<ImageView>(R.id.navsearch)

        explorebutton.setOnClickListener {
            val intent = Intent(this, explorepage::class.java)
            startActivity(intent)
            finish()
        }


    }
}