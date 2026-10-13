package com.example.androidrecursosyestilos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity14 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main14)

        val etMensaje = findViewById<EditText>(R.id.etMensaje)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val mensaje = etMensaje.text.toString()

            // Cambia MainActivity15 por la clase a donde quieras enviar el dato
            val intent = Intent(this, MainActivity14::class.java)
            intent.putExtra("DATO_CLAVE", mensaje)
            startActivity(intent)
        }
    }
}