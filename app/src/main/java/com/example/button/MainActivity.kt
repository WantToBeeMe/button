package com.example.button

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var num = 0f;
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPlus = findViewById<Button>(R.id.button_plus);
        val buttonMin = findViewById<Button>(R.id.button_min);
        val textView = findViewById<TextView>(R.id.textView);

        buttonPlus.setOnClickListener {
            textView.text = "" + ++num;
            textView.setTextSize( num );
        }

        buttonMin.setOnClickListener {
            textView.text = "" + --num;
            textView.setTextSize( num );
        }

    }
}