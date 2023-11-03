package features
/*
O tempo logaritmo é um tipo de complexidade de tempo que é proporcional ao logaritmo do tamanho do problema.
Em outras palavras, o tempo de execução de um algoritmo de tempo logaritmo aumenta de forma lenta à medida
que o tamanho do problema aumenta.

A busca binária é um algoritmo de busca que encontra um elemento específico em um vetor ordenado.
O algoritmo funciona dividindo o vetor pela metade em cada iteração e comparando o elemento de destino
com o elemento do meio. Se o elemento de destino for menor que o elemento do meio,
a busca continua na metade esquerda do vetor. Se o elemento de destino for maior que o elemento do meio,
a busca continua na metade direita do vetor. O processo continua até que o elemento de destino seja encontrado
ou até que a metade restante do vetor esteja vazia.
*/

class BinarySearch {

    fun binarySearch(list: IntArray, item: Int): Int? {
        var low = 0
        var high = list.size - 1

        while (low <= high) {
            val half = (low + high) / 2
            val middleOfTheList = list[half]

            when {
                middleOfTheList == item -> {
                    return half
                }
                middleOfTheList > item -> {
                    high = half - 1
                }
                else -> {
                    low = half + 1
                }
            }
        }
        return null
    }
}