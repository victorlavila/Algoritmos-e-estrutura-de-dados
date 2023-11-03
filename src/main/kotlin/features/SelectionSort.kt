package features/*
A ordenação por seleção é um algoritmo simples de entender e implementar, mas é relativamente ineficiente.
A complexidade de tempo da ordenação por seleção é O(n²),
o que significa que o tempo de execução do algoritmo é proporcional ao quadrado do tamanho do array.
A ordenação por seleção é um algoritmo estável, o que significa que a ordem relativa dos elementos com o mesmo
valor é preservada.
*/

class SelectionSort {

    fun selectionSort(arr: MutableList<Int>): MutableList<Int>{
        val newArr = mutableListOf<Int>()

        for (i in arr.indices) {
            val minimum = minimumSearch(arr)
            newArr.add(arr.removeAt(minimum))
        }
        return newArr
    }

    private fun minimumSearch(arr: MutableList<Int>): Int {
        var minimum = arr[0]
        var minimumIndex = 0

        for (i in 1..<arr.size) {
            if (arr[i] < minimum) {
                minimum = arr[i]
                minimumIndex = i
            }
        }
        return minimumIndex
    }
}