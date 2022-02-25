package com.onex.clever.workout

class ExcerciseRandomizer {
    fun createWorkoutSession():List<Excercise> {
        return listOf(
            Excercise("Armhävning", "På knä eller tå.", listOf("Golv")),
            Excercise("Raketen", "Stamp stamp, klapp klapp.", listOf("Avslutning", "Uppvärmning")),
            Excercise("Nackrullning", "Rulla på nacken", listOf("Stretch"))
        )
    }
}