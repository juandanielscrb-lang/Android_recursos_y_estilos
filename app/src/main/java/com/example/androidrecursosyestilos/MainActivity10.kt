package com.example.androidrecursosyestilos

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity10 : AppCompatActivity() {

    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        // Vincular vistas desde el XML usando sus IDs
        val btnClick = findViewById<Button>(R.id.btnClick)
        val tvContador = findViewById<TextView>(R.id.tvContador)

        // Configurar el evento del botón
        btnClick.setOnClickListener {
            contador++
            tvContador.text = contador.toString()
        }
    }
}