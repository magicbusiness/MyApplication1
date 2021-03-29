package com.example.sampleRipple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variable Initialization
        val btnSample1 = findViewById<Button>(R.id.btnSample)
        val btnSample2 = findViewById<Button>(R.id.btnSample2)
        val btnSample3 = findViewById<Button>(R.id.btnSample3)

        // Button Section
        btnSample1.setOnClickListener {
            Toast.makeText(this, "Sample Button Ripple 1", Toast.LENGTH_SHORT).show()
        }

        btnSample2.setOnClickListener {
            Toast.makeText(this, "Sample Button Ripple 2", Toast.LENGTH_SHORT).show()
        }

        btnSample3.setOnClickListener {
            Toast.makeText(this, "Sample Button Ripple 3", Toast.LENGTH_SHORT).show()
        }
    }
}