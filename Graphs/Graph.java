package com.example.main;
public class Graph {
    private int countV;
    private int[][] matrix;
    Vertex[] vertexList;
    private int maxV = 10;
    private  MyStack stack = new MyStack();


    public Graph() {
        countV = 0;
        matrix = new int[maxV][maxV];
        vertexList = new Vertex[maxV];
    }

    public void addVertex(char name) {
        vertexList[countV++] = new Vertex(name);
    }

    public void addEdge(int start, int end) {
        matrix[start][end] = 1;
        matrix[end][start] = 0;
    }

    public int check(int v) {
        for (int i = 0; i < maxV; i++) {
            if (matrix[v][i] == 1 && vertexList[i].isVisited == false) {
                return i;
            }
        }
        return -1;
    }

    public void peekInDeep(int index){
        System.out.println(vertexList[index].name);
        vertexList[index].isVisited = true;
        stack.push(index);

        while(!stack.isEmpty()){
            int neighborV = check(stack.peek());// neighborv - это соседняя вершина

            if(neighborV==-1){
                neighborV = stack.pop();
            } else{
                System.out.println(vertexList[neighborV].name);
                vertexList[neighborV].isVisited = true;
                stack.push(neighborV);
            }
        }

        for (int i = 0; i < countV; i++) {
            vertexList[i].isVisited = false;
        }
    }
}






