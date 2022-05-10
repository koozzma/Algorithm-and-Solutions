package com.example.main;
public class MyStack {
private int size = 10;
private int top; // вершина которая находится на самом верху стэка
private int [] array;

public MyStack(){
    array = new int[size];
    top = -1; // если в нашем стэке ничего не будет - будет значение -1
}

public void push(int v){
    array[++top] = v;
}

public int pop(){
    return array[top--];
}
    public int peek() {
        return array[top];
    }

    public boolean isEmpty(){
    if(top == -1){
        return true;
    }
    return false;
    }

}
