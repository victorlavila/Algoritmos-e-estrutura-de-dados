package features

import java.util.PriorityQueue

/*
O algoritmo de Dikstra é um algoritmo de otimização que encontra o caminho mais curto entre dois vértices
em um grafo ponderado.
Um grafo ponderado é um grafo em que cada aresta tem um peso associado,
que representa o custo de atravessar a aresta.

O algoritmo de Dikstra funciona da seguinte forma:

Inicializa uma fila com o vértice de origem.
Enquanto a fila não estiver vazia:
Remova o vértice com o menor custo da fila.
Para cada vértice adjacente ao vértice removido:
Se o custo do caminho através do vértice removido para o vértice adjacente for menor do que o
custo atual do caminho para o vértice adjacente, atualize o custo do caminho para o vértice adjacente.
Adicione o vértice adjacente à fila se ele ainda não estiver na fila.
*/

class DijkstraClass(private val vertices: Int) {

    private val adjacencyList: MutableList<MutableList<Pair<Int, Int>>> = MutableList(vertices) {
        mutableListOf()
    }

    fun addEdge(source: Int, destination: Int, weight: Int) {
        adjacencyList[source].add(Pair(destination, weight))
        adjacencyList[destination].add(Pair(source, weight))
    }

    fun dijkstra(startVertex: Int) {
        val distance = IntArray(vertices) { Int.MAX_VALUE }
        distance[startVertex] = 0

        val priorityQueue = PriorityQueue<Pair<Int, Int>>(vertices) { a, b ->
            a.second - b.second
        }

        priorityQueue.add(Pair(startVertex, 0))

        while (priorityQueue.isNotEmpty()) {
            val currentVertex = priorityQueue.poll().first
            val currentDistance = distance[currentVertex]

            for (neighbor in adjacencyList[currentVertex]) {
                val nextVertex = neighbor.first
                val weight = neighbor.second

                val newDistance = currentDistance + weight
                if (newDistance < distance[nextVertex]) {
                    distance[nextVertex] = newDistance
                    priorityQueue.add(Pair(nextVertex, newDistance))
                }
            }
        }

        println("Distâncias mais curtas a partir do vértice $startVertex:")
        for (i in 0..<vertices) {
            println("Vertice $i: ${distance[i]}")
        }
    }
}