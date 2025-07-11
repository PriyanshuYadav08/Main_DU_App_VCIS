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

class StudentDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_student_dashboard)

        val calenderTimetable = findViewById<Button>(R.id.calender_timetable)
        val assignmentExam = findViewById<Button>(R.id.assign_exam)
        val digitalCert = findViewById<Button>(R.id.digitalcert_idcards)
        val resultGrades = findViewById<Button>(R.id.result_grades_btn)
        val feedbackGrievance = findViewById<Button>(R.id.feedback_grievance_btn)

        calenderTimetable.setOnClickListener {
            openWebsite("https://www.du.ac.in/index.php?page=academic-calendar")
        }
        assignmentExam.setOnClickListener {
            openWebsite("https://exam.du.ac.in/index.php")
        }
        digitalCert.setOnClickListener {
            openWebsite("https://digicerti.du.ac.in/")
        }
        resultGrades.setOnClickListener {
            openWebsite("https://slc.uod.ac.in/index.php/site/login")
        }
        feedbackGrievance.setOnClickListener {
            openWebsite("https://app.uod.ac.in/sgr/index.php/form/create")
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