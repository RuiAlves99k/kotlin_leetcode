package model

class TestConstructor {
    private val values = mutableListOf<Int>()
    private val valueIndexMap = mutableMapOf<Int, Int>()

    constructor()

    constructor(initialValues: List<Int>) {
        for (value in initialValues) {
            insert(value)
        }
    }

    constructor(vararg initialValues: Int) : this(initialValues.toList())


    fun insert(value: Int): Boolean {
        val exists = valueIndexMap.contains(value)
        valueIndexMap[value] = values.size
        values.add(value)
        return !exists
    }

    fun remove(value: Int): Boolean {
        val index = valueIndexMap[value] ?: return false

        // Swap the value to remove with the last element for O(1) deletion
        val lastValue = values.last()
        values[index] = lastValue
        valueIndexMap[lastValue] = index

        //Remove the last element
        values.removeAt(values.size - 1)
        valueIndexMap.remove(value)
        return true
    }

    fun getRandom(): Int? = values.randomOrNull()
}