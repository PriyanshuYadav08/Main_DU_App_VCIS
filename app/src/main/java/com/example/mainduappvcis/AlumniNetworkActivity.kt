package com.example.mainduappvcis

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AlumniNetworkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alumni_network)
        supportActionBar?.hide()

        val visitWebsite = findViewById<Button>(R.id.alumni_website)
        val alumniRegis = findViewById<Button>(R.id.alumni_regis)
        val alumniContrib = findViewById<Button>(R.id.alumni_contribution)
        val alumniServices = findViewById<Button>(R.id.alumni_services)

//link not working
        visitWebsite.setOnClickListener {
            openWebsite("https://alumni.du.ac.in/")
        }
        alumniRegis.setOnClickListener {
            openWebsite("https://alumni.uod.ac.in/index.php/site/login")
        }
        alumniContrib.setOnClickListener {
            openWebsite("https://app.uod.ac.in/alumnictr/index.php/settings/payment-user/create")
        }
//link not working
        alumniServices.setOnClickListener {
            openWebsite("https://alumni.du.ac.in/?Alumni-Services")
        }
    }

    private fun openWebsite(url: String) {
        val intent = Intent(this, WebActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }
}