package com.example.androidrecursosyestilos

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity17 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main17)

        val btnMostrarAlerta = findViewById<Button>(R.id.btnMostrarAlerta)

        btnMostrarAlerta.setOnClickListener {
            // Construir el cuadro de diálogo de alerta
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Confirmación del Sistema")
            builder.setMessage("¿Deseas completar y finalizar todos los ejercicios de la guía de Android?")

            // Botón positivo (Aceptar)
            builder.setPositiveButton("Sí, finalizar") { dialog, _ ->
                Toast.makeText(this, "¡Excelente trabajo con la guía!", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }

            // Botón negativo (Cancelar)
            builder.setNegativeButton("Cancelar") { dialog, _ ->
                dialog.dismiss()
            }

            // Mostrar el diálogo en pantalla
            val dialog = builder.create()
            dialog.show()
        }
    }
}