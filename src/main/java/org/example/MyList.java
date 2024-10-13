package org.example;

import java.util.ArrayList;
import java.util.List;

public class MyList<T>{
    private int capacity = 10;
    private final List<T> dizi;


    public MyList() {
        this.dizi = new ArrayList<>(this.capacity);
    }

    public MyList(int capacity){
        this.capacity = capacity;
        this.dizi = new ArrayList<>(capacity);
    }

    public int size(){
        return this.dizi.size();
    }

    public int getCapacity() {
        return capacity;
    }
    public void add(T data){
        if (this.dizi.size() == this.capacity){
            capacity *= 2;
        }
        this.dizi.add(data);
    }
}
