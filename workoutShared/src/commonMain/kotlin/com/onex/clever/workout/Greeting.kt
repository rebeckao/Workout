package com.onex.clever.workout

class Greeting {
    fun greeting(): String {
        val randomizer = ExcerciseRandomizer()
        val session = randomizer.createWorkoutSession()
        return "Workout! \n ${session}!"
    }
}