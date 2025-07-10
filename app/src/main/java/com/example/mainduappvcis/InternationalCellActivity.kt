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

        irWebBtn.setOnClickListener {
            openWebsite("https://ir.du.ac.in/")
        }
        fsrWebBtn.setOnClickListener {
            openWebsite("https://fsr.du.ac.in/")
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
