package com.example.myconverter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.convert.setOnClickListener { conversion() }
    }

    private fun conversion() {
        val input = binding.inputValue.toString()
        val valueInput = input.toInt()
        val output = valueInput * 100

        // val finalOutput= NumberFormat.getInstance().format(output)

    }
}

