package com.laraib.i210865

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class verifyphone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifyphone)


        val signUpButton = findViewById<Button>(R.id.back)

        // Set OnClickListener for the Button
        signUpButton.setOnClickListener {
            // Navigate to a new page here
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }
    }
}