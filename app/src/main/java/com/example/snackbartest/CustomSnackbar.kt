package com.example.snackbartest

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import com.example.snackbartest.databinding.CustomSnackbarLayoutBinding

class CustomSnackbar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : LinearLayoutCompat(context, attrs) {

    private val binding =
        CustomSnackbarLayoutBinding.inflate(LayoutInflater.from(context), this, true)

    val title: TextView = binding.title

    init {
        // TODO: do we need it?
        context.theme.obtainStyledAttributes(attrs, R.styleable.CustomSnackbar, 0, 0).apply {
            val title = getString(R.styleable.CustomSnackbar_title) ?: ""
            this@CustomSnackbar.title.text = title
        }.recycle()
    }

    fun show() {
        binding.title.animate().translationY(80.toDp(context).toFloat())
    }

    private fun hide() {
        binding.title.animate().translationY(0f)
    }
}