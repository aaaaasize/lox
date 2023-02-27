package com.bignerdranch.android.myapplicationasize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var buttonClick: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mTextView = findViewById<TextView>(R.id.text_view)
        val mTextView1 = findViewById<TextView>(R.id.text1_view)
        buttonClick = findViewById(R.id.button_click)
        buttonClick.setOnClickListener {
            Toast.makeText(this, R.string.toast_text, Toast.LENGTH_SHORT).show()
            val mParams = mTextView.layoutParams as RelativeLayout.LayoutParams
            mParams.apply {
                width *= 2
                height*=2
            }
            mTextView.layoutParams= mParams
        }
        buttonClick = findViewById(R.id.button1_click)
        buttonClick.setOnClickListener {
            Toast.makeText(this, R.string.toast1_text, Toast.LENGTH_SHORT).show()
            val mParams = mTextView.layoutParams as RelativeLayout.LayoutParams
            mParams.apply {
                width /= 2
                height/=2
            }
            mTextView.layoutParams= mParams
        }
    }
}