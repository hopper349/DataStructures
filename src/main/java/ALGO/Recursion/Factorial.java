package ALGO.Recursion;

public class Factorial {

    int factorial = 1;

    public double recursionFactorial(int num){
        if(num>1){
            factorial = num*factorial;
            num = num-1;
            return recursionFactorial(num);
        }
        return factorial;
    }

    public int recursionFactorial2(int num){
       if(num==2){
           return 2;
       }
       return num * recursionFactorial2(num-1);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.recursionFactorial2(5);
        System.out.println(f.recursionFactorial2(5));
    }
}