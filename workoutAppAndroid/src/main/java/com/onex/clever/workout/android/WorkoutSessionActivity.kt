package com.onex.clever.workout.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WorkoutSessionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_session)
        val exerciseName: TextView = findViewById(R.id.exerciseName)
        val exerciseDescription: TextView = findViewById(R.id.description)

    }
}