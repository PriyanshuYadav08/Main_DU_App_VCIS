package com.example.mainduappvcis

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "University Of Delhi"
        for (i in 0 until toolbar.childCount) {
            val view = toolbar.getChildAt(i)
            if (view is TextView && view.text == toolbar.title) {
                val typeface = ResourcesCompat.getFont(this, R.font.pjs_bold)
                view.typeface = typeface
                view.textSize = 18f
                view.setTextColor(resources.getColor(R.color.white))
                break
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.header_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.option1 -> {
                Toast.makeText(this, "Student Dashboard clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.option2 -> {
                Toast.makeText(this, "Academic Calenders and Timetables clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.option3 -> {
                Toast.makeText(this, "Assignment and Exam Submissions clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.option4 -> {
                Toast.makeText(this, "University Announcements clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.option5 -> {
                Toast.makeText(this, "Digital Certificates and ID Cards clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.option6 -> {
                Toast.makeText(this, "Result and Grade Tracker clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.option7 -> {
                Toast.makeText(this, "Feedback and Grivence Portal clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.option8 -> {
                Toast.makeText(this, "Career and Internship Portal clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.option9 -> {
                Toast.makeText(this, "Event Registrations and Passes clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.option10 -> {
                Toast.makeText(this, "Faculty Directory and Messaging clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.option11 -> {
                Toast.makeText(this, "Scholarship and Financial Aid Info clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.option12 -> {
                Toast.makeText(this, "International Cell and Exchange Info clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.option13 -> {
                Toast.makeText(this, "Alumni Network Access clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.option14 -> {
                Toast.makeText(this, "Contact Us clicked", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}