package com.example.calculator02;

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val message = intent.getStringExtra("Hasil")

        val textView = findViewById<TextView>(R.id.hasil).apply{
            text = message
        }
    }

}

