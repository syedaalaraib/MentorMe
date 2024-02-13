package com.laraib.i210865

import com.laraib.i210865.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find clickableView after setContentView
        val clickableView: View = findViewById(R.id.clickableView)

        // Set OnClickListener to navigate to a new page
        clickableView.setOnClickListener {
            // Navigate to a new page here
            val intent = Intent(this@MainActivity, LOGIN::class.java)
            startActivity(intent)
        }
    }
}

