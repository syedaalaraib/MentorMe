package com.laraib.i210865

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Hello : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        val f1 = findViewById<ImageView>(R.id.home)

        f1.setOnClickListener {
            val intent = Intent(this, Hello::class.java)
            startActivity(intent)
        }


        val Button11 = findViewById<ImageView>(R.id.profile)

        // Set OnClickListener for the Button
        Button11.setOnClickListener {
            // Navigate to a new page here
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        val Button1 = findViewById<ImageView>(R.id.chat)

        // Set OnClickListener for the Button
        Button1.setOnClickListener {
            // Navigate to a new page here
            val intent = Intent(this, chats::class.java)
            startActivity(intent)
        }

        val loginButton = findViewById<ImageView>(R.id.search)

        // Set OnClickListener for the Button
        loginButton.setOnClickListener {
            // Navigate to a new page here
            val intent = Intent(this, letsfind::class.java)
            startActivity(intent)
        }

        val Button = findViewById<ImageView>(R.id.john)

        // Set OnClickListener for the Button
        Button.setOnClickListener {
            // Navigate to a new page here
            val intent = Intent(this, john::class.java)
            startActivity(intent)
        }


        val B = findViewById<ImageView>(R.id.plus)

        // Set OnClickListener for the Button
        B.setOnClickListener {
            // Navigate to a new page here
            val intent = Intent(this, newmentor::class.java)
            startActivity(intent)
        }


    }
}