package com.onex.clever.workout.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.onex.clever.workout.Excercise
import com.onex.clever.workout.ExcerciseRandomizer

class WorkoutSessionActivity : AppCompatActivity() {
    var currentExcerciseIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_session)
        val exerciseName = findViewById<TextView>(R.id.exerciseName)
        val exerciseDescription = findViewById<TextView>(R.id.description)
        val nextButton = findViewById<Button>(R.id.next_button)

        val randomizer = ExcerciseRandomizer()
        val session = randomizer.createWorkoutSession()

        displayNextExercise(exerciseName, session, exerciseDescription)
        nextButton.setOnClickListener {
            currentExcerciseIndex++
            displayNextExercise(exerciseName, session, exerciseDescription)
        }
    }

    private fun displayNextExercise(
        exerciseName: TextView,
        session: List<Excercise>,
        exerciseDescription: TextView
    ) {
        exerciseName.text = session[currentExcerciseIndex].name
        exerciseDescription.text = session[currentExcerciseIndex].description
    }
}