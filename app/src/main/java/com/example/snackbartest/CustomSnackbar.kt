package com.example.snackbartest

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.appcompat.widget.LinearLayoutCompat
import com.example.snackbartest.databinding.CustomSnackbarLayoutBinding

class CustomSnackbar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : LinearLayoutCompat(context, attrs) {

    private val binding =
        CustomSnackbarLayoutBinding.inflate(LayoutInflater.from(context), this, false)

    fun setTitle(title: String) {
        binding.title.text = title
    }

    init {
        context.theme.obtainStyledAttributes(attrs, R.styleable.CustomSnackbar, 0, 0).apply {
            try {
                val title = getString(R.styleable.CustomSnackbar_title) ?: ""
                setTitle(title)
            } finally {
                recycle()
            }
        }
    }
}