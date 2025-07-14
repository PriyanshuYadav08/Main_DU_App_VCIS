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

class InternationalCellActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_international_cell)
        supportActionBar?.hide()

        val irWebBtn = findViewById<Button>(R.id.ir_web_btn)
        val fsrWebBtn = findViewById<Button>(R.id.fsr_web_btn)

//link is not working
        irWebBtn.setOnClickListener {
            openWebsite("https://ir.du.ac.in/")
        }
        fsrWebBtn.setOnClickListener {
            openWebsite("https://fsr.du.ac.in/")
        }
    }

    private fun openWebsite(url: String) {
        val intent = Intent(this, WebActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }
}
