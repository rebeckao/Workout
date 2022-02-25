package com.onex.clever.workout

class ExcerciseRandomizer {
    fun createWorkoutSession():List<Excercise> {
        val possibleExcercises = listOf(
            Excercise("Push up", "On knees or toes.", listOf("Floor")),
            Excercise("The rocket", "Stomp stomp, clap clap", listOf("Finisher", "Warm up")),
            Excercise("Neck roll", "Roll the neck", listOf("Stretch")),
            Excercise("Squats", "Bend the knees", emptyList()),
            Excercise("Windmill", "Hand towards opposite foot", emptyList()),
            Excercise("Sit up", "Bend your belly", listOf("Floor")),
            Excercise("The plank", "On knees or toes", listOf("Floor")),
            Excercise("Side stretches", "Bend sideways and touch the sky", listOf("Stretch")),
            Excercise("Lunges", "90 deg knees", emptyList()),
            Excercise("Burpees", "The one that makes you vomit", emptyList()),
            Excercise("Jumps", "Touch the floor and then reach for the sky", emptyList()),
            Excercise(
                "One leg balance",
                "Stand on one leg, close your eyes for extra challenge",
                emptyList()
            )
        )
        return possibleExcercises
    }
}