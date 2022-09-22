package StackPackage;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Dipu");
//        stack.peek();
        stack.push("Abhi");
//        stack.peek();
        stack.push("Oreo");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
//        stack.peek();
        System.out.println(stack);


        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(3);
        arr1.add(4);

        arr1.addAll(arr2);

        arr1.forEach(x-> System.out.println(x));

    }
}
