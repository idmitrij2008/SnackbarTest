package com.example.snackbartest

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.snackbartest.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.customSnackbar.title.text = "Another test title!"

        binding.button.setOnClickListener {
            binding.customSnackbar.show()
        }

        setContentView(binding.root)
    }
}

fun Int.toDp(context: Context): Int = (context.resources.displayMetrics.density * this).roundToInt()

fun Float.toDp(context: Context): Int =
    (context.resources.displayMetrics.density * this).roundToInt()