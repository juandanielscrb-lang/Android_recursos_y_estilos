package com.example.androidrecursosyestilos

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity15 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main15)

        val tvDatoRecibido = findViewById<TextView>(R.id.tvDatoRecibido)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)

        // Recuperar el dato enviado desde la actividad anterior
        val dato = intent.getStringExtra("DATO_CLAVE")

        if (dato != null && dato.isNotEmpty()) {
            tvDatoRecibido.text = dato
        } else {
            tvDatoRecibido.text = "No se recibió ningún texto."
        }

        // Botón para cerrar esta actividad y volver a la anterior
        btnRegresar.setOnClickListener {
            finish()
        }
    }
}