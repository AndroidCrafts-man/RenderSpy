package com.base.render

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var contentView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        contentView = TextView(this)
        contentView.text = "Loading content..."
        setContentView(contentView)

        contentView.postDelayed({
            contentView.text = "Screen is usable"
            reportIsUsable()
        }, 1000)
    }
}
