package com.example.main;
public class Runner {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');//0
        graph.addVertex('B');//1
        graph.addVertex('C');//2
        graph.addVertex('D');//3
        graph.addVertex('E');//4
        graph.addVertex('F');//5
        graph.addVertex('G');//6
        graph.addVertex('H');//7

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(5,6);
        graph.addEdge(6,7);

        graph.peekInDeep(0);

    }
}
