fun main(args: Array<String>) {

    val dijkstra = DijkstraClass(6)

    dijkstra.addEdge(0, 1, 4)
    dijkstra.addEdge(0, 2, 2)
    dijkstra.addEdge(1, 2, 5)
    dijkstra.addEdge(1, 3, 10)
    dijkstra.addEdge(2, 3, 3)
    dijkstra.addEdge(2, 4, 2)
    dijkstra.addEdge(3, 4, 7)
    dijkstra.addEdge(3, 5, 8)
    dijkstra.addEdge(4, 5, 2)

    dijkstra.dijkstra(0)
}