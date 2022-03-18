package com.example.snackbartest

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.snackbartest.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

private const val NO_DRAWABLE = 0

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val snackBar = Snackbar.make(binding.root, "Text", Snackbar.LENGTH_SHORT).apply {
                setBackgroundTint(ContextCompat.getColor(this@MainActivity, R.color.red_error))
            }

            snackBar.view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
                .run {
                    setTextColor(ContextCompat.getColor(this@MainActivity, R.color.white))
                    setCompoundDrawablesWithIntrinsicBounds(
                        R.drawable.union,
                        NO_DRAWABLE,
                        NO_DRAWABLE,
                        NO_DRAWABLE
                    )
                    compoundDrawablePadding = 16
                    textAlignment = View.TEXT_ALIGNMENT_CENTER
                }

//            snackBar.anchorView = binding.textView

            snackBar.show()
        }
    }
}