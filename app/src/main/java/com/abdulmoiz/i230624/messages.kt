package com.abdulmoiz.i230624

import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class messages : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_messages)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val msgsIds = listOf(R.id.msg1row, R.id.msg2row, R.id.msg3row, R.id.msg4row, R.id.msg5row, R.id.msg6row)

        for (id in msgsIds) {
            val msgButton = findViewById<RelativeLayout>(id)
            msgButton.setOnClickListener {
                val intent = Intent(this, individualmsg::class.java)
                startActivity(intent)
            }
        }

    }
}