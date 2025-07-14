package com.example.mainduappvcis

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
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

        val visitWebsiteBtn = findViewById<Button>(R.id.visit_website_main_btn)
        val fotDeptBtn = findViewById<Button>(R.id.fot_dept_btn)
        val fmsDeptBtn = findViewById<Button>(R.id.fms_dept_btn)
        val lawDeptBtn = findViewById<Button>(R.id.law_dept_btn)
        val eduDeptBtn = findViewById<Button>(R.id.edu_dept_btn)
        val fosDeptBtn = findViewById<Button>(R.id.fos_dept_btn)
        val otherDeptBtn = findViewById<Button>(R.id.other_dept_btn)

        visitWebsiteBtn.setOnClickListener {
            openWebsite("https://www.du.ac.in/")
        }
        fotDeptBtn.setOnClickListener {
            openWebsite("https://fot.du.ac.in/")
        }
        fmsDeptBtn.setOnClickListener {
            openWebsite("https://fms.edu/")
        }
        lawDeptBtn.setOnClickListener {
            openWebsite("https://lawfaculty.du.ac.in/")
        }
        eduDeptBtn.setOnClickListener {
            openWebsite("https://cie.du.ac.in/")
        }
        fosDeptBtn.setOnClickListener {
            openWebsite("https://www.du.ac.in/index.php?page=faculty-of-science")
        }
        otherDeptBtn.setOnClickListener {
            openWebsite("https://www.du.ac.in/index.php?page=departments-at-du")
        }
    }

    private fun openWebsite(url: String) {
        val intent = Intent(this, WebActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.header_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.option1 -> {
                val intent = Intent(this, StudentDashboardActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.option5 -> {
                val intent = Intent(this, CareerInternshipActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.option8 -> {
                val intent = Intent(this, InternationalCellActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.option9 -> {
                val intent = Intent(this, AlumniNetworkActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.option10 -> {
                val intent = Intent(this, ContactUsActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}