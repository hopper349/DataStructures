package ALGO.Recursion;

public class Fibonacci {

    public void printFibonacci(int index) {
        int x = 0;
        int y = 1;
        if (index == 0) {
            System.out.println(x);
        } else if (index == 1) {
            System.out.println(y);
        } else {
            System.out.println(x);
            System.out.println(y);
            for (int i = 2; i < 5; i++) {
                System.out.println(x + y);
                int temp = x + y;
                x = y;
                y = temp;
            }
        }
    }

    public int fibRecursive(int index){
        if(index<2){
            return index;
        }
        return fibRecursive(index-1) + fibRecursive(index-2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        //fibonacci.printFibonacci(5);
        fibonacci.fibRecursive(3);
        System.out.println(fibonacci.fibRecursive(3));
    }
}
