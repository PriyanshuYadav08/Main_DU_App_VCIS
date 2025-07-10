package com.example.mainduappvcis

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri

class CareerInternshipActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_career_internship)
        supportActionBar?.hide()

        val registerNowCpcBtn = findViewById<Button>(R.id.register_now_cpc_btn)
        val aboutCpcBtn = findViewById<Button>(R.id.about_cpc)
        val forStudentsCpcBtn = findViewById<Button>(R.id.for_students_cpc)
        val forRecruitersBtn = findViewById<Button>(R.id.for_recruiters_btn)
        val eventsCpc = findViewById<Button>(R.id.events_cpc)
        val contactUsBtn = findViewById<Button>(R.id.contact_cpc)

        registerNowCpcBtn.setOnClickListener {
            openWebsite("https://placement.du.ac.in/for-students/placement-internship-opportunities-2025")
        }
        aboutCpcBtn.setOnClickListener {
            openWebsite("https://placement.du.ac.in/about-us")
        }
        forStudentsCpcBtn.setOnClickListener {
            openWebsite("https://placement.du.ac.in/for-students/placement-internship-opportunities-2025")
        }
        forRecruitersBtn.setOnClickListener {
            openWebsite("https://placement.du.ac.in/for-recruiters")
        }
        eventsCpc.setOnClickListener {
            openWebsite("https://placement.du.ac.in/events")
        }
        contactUsBtn.setOnClickListener {
            openWebsite("https://placement.du.ac.in/contact-us")
        }
    }

    private fun openWebsite(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Toast.makeText(this, "No browser found to open this link", Toast.LENGTH_SHORT).show()
        }
    }
}