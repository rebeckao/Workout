package com.onex.clever.workout.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        val restart_button = findViewById<Button>(R.id.restart)
        restart_button.setOnClickListener{
            val intent = Intent(this, WorkoutSessionActivity::class.java)
            startActivity(intent)
        }
    }
}