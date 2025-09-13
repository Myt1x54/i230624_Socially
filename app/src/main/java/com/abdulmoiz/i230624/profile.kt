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

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val explorebutton = findViewById<ImageView>(R.id.navsearch)

        explorebutton.setOnClickListener {
            val intent = Intent(this, explorepage::class.java)
            startActivity(intent)
            finish()
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
            finish()
        }

        val highlightsIds = listOf(R.id.friendsicon, R.id.sporticon, R.id.designicon)

        for (id in highlightsIds) {
            val highlightButton = findViewById<de.hdodenhof.circleimageview.CircleImageView>(id)
            highlightButton.setOnClickListener {
                val intent = Intent(this, highlight::class.java)
                startActivity(intent)
            }
        }

        val editprofilebutton = findViewById<Button>(R.id.editprofile)

        editprofilebutton.setOnClickListener {
            val intent = Intent(this, editprofile::class.java)
            startActivity(intent)
        }

        val storycreatebutton = findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.newicon)

        storycreatebutton.setOnClickListener {
            val intent = Intent(this, storycreation::class.java)
            startActivity(intent)
        }



    }
}