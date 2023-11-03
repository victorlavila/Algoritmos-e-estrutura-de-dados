package features

import java.util.LinkedList
import java.util.Queue

/*
um grafo é uma estrutura de dados que representa um conjunto de objetos, chamados de vértices,
e um conjunto de conexões entre esses objetos, chamadas de arestas.
Os vértices podem ser representados por pontos em um plano ou por símbolos em uma lista.
As arestas são representadas por linhas que conectam dois vértices.

Os grafos são uma estrutura de dados versátil que pode ser usada para representar uma ampla variedade de
relacionamentos. Exemplo: Redes sociais, árvores e mapas.
*/

class GraphClass {

    private val neighbors: MutableMap<String, List<String>> = mutableMapOf()

    fun addFriends(name: String, friends: List<String>) {
        neighbors[name] = friends
    }

    fun salesSearch(start: String): String? {
        val row: Queue<String> = LinkedList()
        val visited = mutableSetOf<String>()
        row.add(start)
        visited.add(start)

        while (row.isNotEmpty()) {
            val pearson = row.poll()
            if (seller(pearson)) {
                return pearson
            }
            neighbors[pearson]?.forEach {friend ->
                if (friend !in visited) {
                    row.add(friend)
                    visited.add(friend)
                }
            }
        }
        return null
    }

    private fun seller(pearson: String): Boolean {
        return pearson.endsWith("David")
    }
}