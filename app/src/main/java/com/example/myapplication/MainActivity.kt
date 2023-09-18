package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<TextView>(R.id.texto1)

        val boton = findViewById<Button>(R.id.inicio)

        val boton1 = findViewById<Button>(R.id.galeria)


        boton.setOnClickListener {

            texto.text = "hola Mundo"


        }

        boton1.setOnClickListener {

            texto.text = "prueba2"

        }





    }
}