package com.example.iot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLight = findViewById<Button>(R.id.btnLight)

        btnLight.setOnClickListener{
            var btntext = btnLight.text.toString();

            val intent = Intent(this@MainActivity, SmartLight::class.java)
            intent.putExtra("btext", btntext)
            startActivity(intent)
        }
    }
}