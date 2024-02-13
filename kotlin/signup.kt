package com.laraib.i210865

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        val signUpButton = findViewById<Button>(R.id.signup)

        // Set OnClickListener for the Button
        signUpButton.setOnClickListener {
            // Navigate to a new page here
            val intent = Intent(this, verifyphone::class.java)
            startActivity(intent)
        }

        // Set underline for the text
        val loginButton = findViewById<Button>(R.id.login)
        val content = SpannableString("Login")
        content.setSpan(UnderlineSpan(), 0, content.length, 0)
        loginButton.text = content



        // Find the Spinners by ID
        val countrySpinner = findViewById<Spinner>(R.id.countrySpinner)
        val citySpinner = findViewById<Spinner>(R.id.countrySpinner1)

        // Define lists of countries and cities
        val countries = listOf("Select Country", "Pakistan", "Switzerland", "Saudi Arabia")
        val citiesMap = mapOf(
            "Select Country" to listOf("Select City"),
            "Pakistan" to listOf("Select City", "Islamabad", "Karachi", "Lahore"),
            "Switzerland" to listOf("Select City", "Zurich", "Geneva", "Bern"),
            "Saudi Arabia" to listOf("Select City", "Riyadh", "Jeddah", "Dammam")
        )

        // Create an ArrayAdapter for countries
        val countryAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        countrySpinner.adapter = countryAdapter

        // Create an ArrayAdapter for cities (initially with a default "Select City" item)
        val cityAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listOf("Select City"))
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        citySpinner.adapter = cityAdapter

        // Set the OnItemSelectedListener for the countrySpinner
        countrySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parentView: AdapterView<*>,
                selectedItemView: View?,
                position: Int,
                id: Long
            ) {
                // Get the selected country
                val selectedCountry = parentView.getItemAtPosition(position).toString()

                // Update the list of cities based on the selected country
                val selectedCities = citiesMap[selectedCountry] ?: listOf("Select City")
                updateCitySpinner(selectedCities)
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {
                // Do nothing here
            }
        }
    }

    // Function to update the city spinner with a new list of cities
    private fun updateCitySpinner(cities: List<String>) {
        val citySpinner = findViewById<Spinner>(R.id.countrySpinner1)
        val cityAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, cities)
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        citySpinner.adapter = cityAdapter
    }
}
