import daily.*

fun main(args: Array<String>) {
    val listOfExercise: Array<Exercise> = arrayOf(
        Daily20250228()
    )
    listOfExercise.map { exercise ->
        if (exercise.start()) {
            println("${exercise::class.simpleName}: Success!")
        } else {
            println("${exercise::class.simpleName}: Failure!")
        }
    }
}

interface Exercise {
    fun start(): Boolean
}

class ExerciseException(
    val input: Any,
    val output: Any,
    val expectedOutput: Any
) : Exception() {
    override val message: String
        get() = "\nInput: $input\nOutput:$output\nExpected:$expectedOutput"
}