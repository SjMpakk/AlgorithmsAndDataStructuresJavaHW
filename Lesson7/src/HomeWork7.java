/**
 *
 * Java home work 7 lesson
 *
 * @author Denisov Alexey
 * @version dated Nov 11, 2018
 */

import java.util.Stack;

public class HomeWork7 {
    public static void main(String[] args) {

        shortestWay();
//        testBfs();
//        testDfs();
//        testGraph();

    }
    private static void shortestWay () {
        Graph graph = new Graph(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Тамбов");
        graph.addVertex("Липецк");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdge("Москва","Тула");
        graph.addEdge("Москва","Рязань");
        graph.addEdge("Москва","Калуга");
        graph.addEdge("Тула","Липецк");
        graph.addEdge("Рязань","Тамбов");
        graph.addEdge("Калуга","Орел");
        graph.addEdge("Липецк","Воронеж");
        graph.addEdge("Тамбов","Саратов");
        graph.addEdge("Орел","Курск");
        graph.addEdge("Саратов","Воронеж");
        graph.addEdge("Курск","Воронеж");

        Stack<String> path = graph.findShortPathViaBfs("Курск", "Саратов");
        System.out.println("\n The shortest path:");
        System.out.println(String.join(" -> ", path));
    }

    private static void testBfs() {
        Graph graph = new Graph(8);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");

        graph.addEdge("B", "E");

        graph.addEdge("C", "F");

        graph.addEdge("D", "G");

        graph.addEdge("E", "H");

        graph.bfs("A");
    }

    private static void testDfs() {
        Graph graph = new Graph(7);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");

        graph.addEdge("B", "E");

        graph.addEdge("D", "F");
        graph.addEdge("F", "G");

        graph.dfs("A");
    }

    private static void testGraph() {
        Graph graph = new Graph(8);
        graph.addVertex("Oleg");
        graph.addVertex("Petya");
        graph.addVertex("Sasha");
        graph.addVertex("Alexey");

        System.out.println(graph.addEdge("Oleg", "Sasha"));
        System.out.println(graph.addEdge("Oleg", "Andrey"));

        graph.display();
    }
}
