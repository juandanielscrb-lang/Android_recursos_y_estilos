package com.example.androidrecursosyestilos

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity13 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)

        val spinnerOpciones = findViewById<Spinner>(R.id.spinnerOpciones)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        // Lista de elementos que aparecerán en el Spinner
        val listaOpciones = listOf("Opción 1: Java", "Opción 2: Kotlin", "Opción 3: PHP", "Opción 4: Laravel")

        // Crear un adaptador usando un diseño predeterminado de Android
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, listaOpciones)
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Asignar el adaptador al Spinner
        spinnerOpciones.adapter = adaptador

        // Capturar el evento de selección
        spinnerOpciones.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val seleccionado = parent.getItemAtPosition(position).toString()
                tvResultado.text = "Seleccionado: $seleccionado"
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Acción si no hay nada seleccionado
            }
        }
    }
}