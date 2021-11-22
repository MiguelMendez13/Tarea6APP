package com.example.tarea6app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tarea6app.databinding.ActivityMainBinding


import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val gson = Gson()
        binding.boton.setOnClickListener{
            val texto = "{'nombre':'Fernando Gomez','colorFavorito':'Red','comidaFavorita':'Pollo','numFavorito':15}" // binding.editTXT.toString() 
            val datos:Datos = gson.fromJson(texto, Datos::class.java)
            binding.nombreTXT.text = datos.nombre
            binding.colorTXT.text = datos.colorFavorito
            binding.comidaTXT.text = datos.comidaFavorita
            binding.numeroTXT.text =  datos.numFavorito



        }
    }
}

class Datos{
    var nombre = ""
    var colorFavorito = ""
    var comidaFavorita = ""
    var numFavorito = ""
}