
/*
O algoritmo QuickSort é um algoritmo de ordenação de dados que usa o paradigma de divisão e conquista.
O algoritmo funciona da seguinte forma:
- Escolha um elemento da lista como pivô.
- Particione a lista em duas sublistas, uma com todos os elementos menores que o pivô e outra com todos os
elementos maiores ou iguais que o pivô.
Recursivamente ordene as duas sublistas.
O algoritmo QuickSort é um dos algoritmos de ordenação mais rápidos e eficientes,
com uma complexidade de tempo média de O(n log n).
*/

class QuickSortClass {

    fun quickSort(arr: List<Int>): List<Int> {
        if (arr.size < 2) {
            return arr
        }

        val pivot = arr.first()
        val minors = arr.drop(1).filter { it <= pivot }
        val bigger = arr.drop(1).filter { it > pivot }

        return quickSort(minors) + pivot + quickSort(bigger)
    }
}