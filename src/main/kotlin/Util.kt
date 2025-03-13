import kotlin.reflect.KFunction1

abstract class TestableClass<T>(open val value: T) {
    abstract fun string() : String
}

class WrapTestableClass<T>(override val value: T): TestableClass<T>(value) {
    override fun string(): String {
        return value.toString()
    }
}

class WrapCollection<T>(override val value: Collection<T>) : TestableClass<Collection<T>>(value) {
    override fun string(): String {
        return "[${value.joinToString()}]"
    }
}

class WrapCollectionInt(override val value: IntArray) : TestableClass<IntArray>(value) {
    override fun string(): String {
        return "[${value.joinToString()}]"
    }
}

class WrapColCollection<T>(override val value: Collection<Collection<T>>) : TestableClass<Collection<Collection<T>>>(value) {
    override fun string(): String {
        return "[${value.joinToString { it.joinToString() }}]"
    }
}

fun <T, U> runTests(
    function: KFunction1<T, U>,
    tests: Array<Pair<T, U>>,
    wrapperU: (U) -> TestableClass<U>): Boolean {
    var result = true
    for (i in tests.indices) {
        val testRes = function(tests[i].first)
        val wrapperRes = wrapperU(testRes).string()
        val wrapperTest = wrapperU(tests[i].second).string()
        val test = wrapperRes == wrapperTest
        result = result && test
        println("Test ${i + 1}: $test Res: $wrapperRes, Sol: $wrapperTest")
    }
    return result
}