package com.laraib.i210865

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.widget.Button

class LOGIN : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        val loginButton = findViewById<Button>(R.id.login)

        // Set OnClickListener for the Button
        loginButton.setOnClickListener {
            // Navigate to a new page here
            val intent = Intent(this, Hello::class.java)
            startActivity(intent)
        }

        val forgotButton = findViewById<Button>(R.id.forgotpassword)

        // Set OnClickListener for the Button
        forgotButton.setOnClickListener {
            // Navigate to a new page here
            val intent = Intent(this, forgotpassword::class.java)
            startActivity(intent)
        }


        val signUpButton = findViewById<Button>(R.id.signup)

        // Set OnClickListener for the Button
        signUpButton.setOnClickListener {
            // Navigate to a new page here
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

        // Set underline for the text
        val content = SpannableString("Sign up?")
        content.setSpan(UnderlineSpan(), 0, content.length, 0)
        signUpButton.text = content


    }
}