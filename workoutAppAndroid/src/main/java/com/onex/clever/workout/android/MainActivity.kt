package com.onex.clever.workout.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.onex.clever.workout.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start_button = findViewById<Button>(R.id.start_workout)
        start_button.setOnClickListener{
            val intent = Intent(this, WorkoutSessionActivity::class.java)
            startActivity(intent)
        }
    }
}
