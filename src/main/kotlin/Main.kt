import features.GreedyCode
import features.Item

fun main() {

    val greedyCode = GreedyCode()
    val knapsackCapacity = 15.0

    val items = listOf(
        Item(5.0, 10.0),
        Item(3.0, 7.0),
        Item(8.0, 15.0)
    )

    val maxValue = greedyCode.fractionalKnapsack(knapsackCapacity, items)
    println("Maximum value in de knapsack: ${maxValue.toInt()}")
}