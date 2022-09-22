package StackPackage;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StackArray<T> {

    ArrayList<T> arr = new ArrayList<>();

    public void push(T data){
        arr.add(data);
    }

    public void pop(){
        arr.remove(arr.size()-1);
    }

    public void peek(){
        arr.get(arr.size()-1);
    }
}
