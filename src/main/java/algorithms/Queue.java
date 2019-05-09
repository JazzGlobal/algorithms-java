package algorithms;

import java.util.ArrayList;

public class Queue<T> {

    private ArrayList<T> objectList;
    private int size;

    public Queue(int size) {
        this.size = size;
        objectList = new ArrayList<T>();
    }

    public T peek(){
        if(this.isEmpty()){
            System.out.println("Could not peek, queue is empty");
            return null;
        }
        else {
            return objectList.get(0);
        }
    }

    public void add(T data){
        if(this.isFull()){
            System.out.println("Queue is full, cannot perform add operation");
        }
        else {
            this.objectList.add(data);
        }
    }

    public void remove(){
        if(this.isEmpty()){
            System.out.println("Queue is empty, cannot perform remove operation");
        }
        else {
            this.objectList.remove(0);
        }
    }

    public boolean isEmpty(){
        return this.objectList.size() < 1;
    }

    public boolean isFull(){
        return this.objectList.size() == size;
    }
}

