package com.example.snackbartest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.snackbartest.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            Snackbar
                .make(binding.root, "Text", Snackbar.LENGTH_SHORT)
                .apply { anchorView = binding.button }
                .show()
        }
    }
}