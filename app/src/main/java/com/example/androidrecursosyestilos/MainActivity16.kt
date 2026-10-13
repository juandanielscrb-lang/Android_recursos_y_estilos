package com.example.androidrecursosyestilos

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity16 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main16)

        val btnToastCorto = findViewById<Button>(R.id.btnToastCorto)
        val btnToastLargo = findViewById<Button>(R.id.btnToastLargo)

        // Toast de duración corta
        btnToastCorto.setOnClickListener {
            Toast.makeText(this, "¡Este es un mensaje corto!", Toast.LENGTH_SHORT).show()
        }

        // Toast de duración larga
        btnToastLargo.setOnClickListener {
            Toast.makeText(this, "¡Este es un mensaje largo que dura un poco más en pantalla!", Toast.LENGTH_LONG).show()
        }
    }
}