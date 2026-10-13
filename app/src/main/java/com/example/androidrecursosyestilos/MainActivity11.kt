package com.example.androidrecursosyestilos

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class MainActivity11 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)

        val checkBox = findViewById<CheckBox>(R.id.myCheckBox)
        val btnToggle = findViewById<Button>(R.id.btnToggle)

        // Al pulsar el botón, se invierte el estado actual del CheckBox[cite: 102]
        btnToggle.setOnClickListener {
            checkBox.isChecked = !checkBox.isChecked
        }
    }
}