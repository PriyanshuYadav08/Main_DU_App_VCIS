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

class ContactUsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contact_us)
        supportActionBar?.hide()

        val visitAllDuColleges = findViewById<Button>(R.id.visit_du_colleges_btn)
        val contactDirectory = findViewById<Button>(R.id.contact_directory_btn)

        visitAllDuColleges.setOnClickListener {
            openWebsite("https://www.du.ac.in/index.php?page=colleges-at-du")
        }
        contactDirectory.setOnClickListener {
            openWebsite("https://www.du.ac.in/index.php?page=administrative-offices")
        }
    }

    private fun openWebsite(url: String) {
        val intent = Intent(this, WebActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }
}