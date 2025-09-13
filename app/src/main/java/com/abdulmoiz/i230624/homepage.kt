package com.abdulmoiz.i230624

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val explorebutton = findViewById<ImageView>(R.id.navsearch)

        explorebutton.setOnClickListener {
            val intent = Intent(this, explorepage::class.java)
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

        val cameraButton = findViewById<ImageView>(R.id.camera)

        cameraButton.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (intent.resolveActivity(packageManager) != null) {
                startActivityForResult(intent, 100) // 100 = request code
            }
        }

        val msgbutton = findViewById<ImageView>(R.id.msg)

        msgbutton.setOnClickListener {
            val intent = Intent(this, messages::class.java)
            startActivity(intent)
        }

        val storyIds = listOf(R.id.npc1, R.id.npc2, R.id.npc3, R.id.npc4, R.id.npc5)

        for (id in storyIds) {
            val storyButton = findViewById<de.hdodenhof.circleimageview.CircleImageView>(id)
            storyButton.setOnClickListener {
                val intent = Intent(this, viewstory::class.java)
                startActivity(intent)
            }
        }

        val profileIds = listOf(R.id.npc1name, R.id.npc2name, R.id.npc3name, R.id.npc4name, R.id.npc5name)

        for (id in profileIds) {
            val profileButton = findViewById<TextView>(id)
            profileButton.setOnClickListener {
                val intent = Intent(this, visitprofilefollowing::class.java)
                startActivity(intent)
            }
        }

        val profilevisitunknown = findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.npc6)

        profilevisitunknown.setOnClickListener {
            val intent = Intent(this, visitprofile::class.java)
            startActivity(intent)
        }

        val profilevisitunknown2 = findViewById<TextView>(R.id.npc6name)

        profilevisitunknown2.setOnClickListener {
            val intent = Intent(this, visitprofile::class.java)
            startActivity(intent)
        }

        val storycreationbutton = findViewById<de.hdodenhof.circleimageview.CircleImageView>(R.id.profile_image)

        storycreationbutton.setOnClickListener {
            val intent = Intent(this, storycreation::class.java)
            startActivity(intent)
        }


    }
}