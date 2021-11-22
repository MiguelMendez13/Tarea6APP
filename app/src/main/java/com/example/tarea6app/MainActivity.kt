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

    }
}