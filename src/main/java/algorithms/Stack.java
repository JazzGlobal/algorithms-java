package algorithms;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> objectList;
    private int size;

    public Stack(int size){
        this.size = size;
        objectList = new ArrayList<T>();
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("Stack was empty, could not perform peek operation");
            return null;
        }
        else {
            return objectList.get(objectList.size() - 1);
        }
    }

    public T pop(){
        if(isEmpty()){
            System.out.println("Stack was empty, could not perform pop operation");
            return null;
        }
        else {
            T obj = objectList.get(objectList.size() - 1);
            objectList.remove(objectList.size() - 1);
            return obj;
        }
    }
    public void add(T data){
        if(isFull()){
            System.out.println("Stack was full, could not perform add operation");
        }
        else {
            objectList.add(data);
        }
    }

    public boolean isEmpty(){
        return objectList.size() < 1;
    }

    public boolean isFull(){
        return objectList.size() == size;
    }
}
