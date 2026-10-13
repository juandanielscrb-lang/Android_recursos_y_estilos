package com.example.androidrecursosyestilos

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity12 : AppCompatActivity() {

    private lateinit var tvPantalla: TextView
    private var expresion = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)

        tvPantalla = findViewById(R.id.tvPantalla)

        val botones = listOf(
            R.id.btn0 to "0", R.id.btn1 to "1", R.id.btn2 to "2", R.id.btn3 to "3",
            R.id.btn4 to "4", R.id.btn5 to "5", R.id.btn6 to "6", R.id.btn7 to "7",
            R.id.btn8 to "8", R.id.btn9 to "9", R.id.btnSum to "+", R.id.btnRes to "-",
            R.id.btnMul to "*", R.id.btnDiv to "/"
        )

        for ((id, valor) in botones) {
            findViewById<Button>(id).setOnClickListener {
                expresion += valor
                tvPantalla.text = expresion
            }
        }

        findViewById<Button>(R.id.btnClear).setOnClickListener {
            expresion = ""
            tvPantalla.text = ""
        }

        findViewById<Button>(R.id.btnIgual).setOnClickListener {
            try {
                val resultado = evaluarExpresion(expresion)
                tvPantalla.text = resultado.toString()
                expresion = resultado.toString()
            } catch (e: Exception) {
                tvPantalla.text = "Error"
                expresion = ""
            }
        }
    }
    private fun evaluarExpresion(expr: String): Double {
        return when {
            expr.contains("+") -> {
                val partes = expr.split("+")
                partes[0].toDouble() + partes[1].toDouble()
            }
            expr.contains("-") -> {
                val partes = expr.split("-")
                partes[0].toDouble() - partes[1].toDouble()
            }
            expr.contains("*") -> {
                val partes = expr.split("*")
                partes[0].toDouble() * partes[1].toDouble()
            }
            expr.contains("/") -> {
                val partes = expr.split("/")
                partes[0].toDouble() / partes[1].toDouble()
            }
            else -> expr.toDouble()
        }
    }
}