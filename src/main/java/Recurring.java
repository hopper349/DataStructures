import java.util.HashMap;
import java.util.HashSet;

public class Recurring {

    public int recurr(int[] arr){
        int len = arr.length;
        for(int i=0; i<len; i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public int recurr2(int[] arr){
        int len = arr.length;
        HashSet<Integer> hs = new HashSet<Integer>();
        int len2 =0;

        for(int i=0; i <len; i++){
            hs.add(arr[i]);
            if(hs.size()!=len2+1){
                return arr[i];
            }
            else {
                len2++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Recurring r =new Recurring();
        System.out.println(r.recurr2(new int[]{1, 9, 5,1,4,6,7,83,3,2,4,1,4}));
    }
}
