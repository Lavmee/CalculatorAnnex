package com.annexflow.calculatorannex.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.annexflow.calculatorannex.databinding.ActivityMainBinding
import com.annexflow.calculatorannex.presentation.extension.viewInflateBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewInflateBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}