package com.example.mainduappvcis

import android.content.Intent
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
                val intent = Intent(this, StudentDashboardActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.option5 -> {
                val intent = Intent(this, CareerInternshipActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.option7 -> {
                val intent = Intent(this, ScholarshipFinancialAidActivity::class.java)
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