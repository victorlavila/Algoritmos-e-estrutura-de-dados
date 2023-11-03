package features

/*
Algoritmos gulosos, ou algoritmos gananciosos são usados para resolver problemas de otimização,
onde o objetivo é encontrar a melhor solução possível a partir de um conjunto de escolhas em um
determinado contexto. Os algoritmos gananciosos tomam decisões locais em cada etapa,
com a esperança de que essas decisões levem a uma solução globalmente ótima.

Não garante a melhor solução global: Algoritmos gulosos não garantem que a solução encontrada seja a
melhor solução global para um problema de otimização.
No entanto, eles são eficazes em muitos casos em que encontrar a solução ótima pode ser computacionalmente caro.
*/

class GreedyCode {

    fun fractionalKnapsack(capacity: Double, items: List<Item>): Double {

        val sortedItems = items.sortedByDescending { item ->
            item.value / item.weight
        }

        var remainingCapacity = capacity
        var totalValue = 0.0

        for (item in sortedItems) {
            if (remainingCapacity <= 0.0) {
                break
            }

            val amountToAdd = minOf(remainingCapacity, item.weight)
            totalValue += amountToAdd * (item.value / item.weight)
            remainingCapacity -= amountToAdd
        }
        return totalValue
    }
}

data class Item(
    val weight: Double,
    val value: Double
)