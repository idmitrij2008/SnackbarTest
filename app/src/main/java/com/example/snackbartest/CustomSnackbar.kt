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
}