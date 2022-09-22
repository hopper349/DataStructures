import java.util.ArrayList;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

       /* ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(33);

        int a =10;
        String aa =Integer.parseInt(a) ;
        System.out.println(arr1.stream().reduce(10,(x,y) -> x+y));

        System.out.println(arr1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()));*/


        String stt="Dipanshu";
        String[] aa=stt.split("");
        System.out.println(aa[aa.length-1]);
    }

    public int sum(int a,int b){
        return a+b;
    }
}
