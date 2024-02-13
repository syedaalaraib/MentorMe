package com.laraib.i210865

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast

class newmentor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newmentor)

        val l = findViewById<ImageView>(R.id.camera)

        // Set OnClickListener for the Button
        l.setOnClickListener {
            // Navigate to a new page here
            val intent = Intent(this, photo::class.java)
            startActivity(intent)
        }

        val lo = findViewById<ImageView>(R.id.video)

        // Set OnClickListener for the Button
        lo.setOnClickListener {
            // Navigate to a new page here
            val intent = Intent(this, video::class.java)
            startActivity(intent)
        }

        val loginButton = findViewById<ImageView>(R.id.back)

        // Set OnClickListener for the Button
        loginButton.setOnClickListener {
            // Navigate to a new page here
            val intent = Intent(this, Hello::class.java)
            startActivity(intent)
        }

        val countrySpinner: Spinner = findViewById(R.id.countrySpinner)

        val countries = listOf("Select Status", "   Available", "Busy", "On leave")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        countrySpinner.adapter = adapter

    }
}