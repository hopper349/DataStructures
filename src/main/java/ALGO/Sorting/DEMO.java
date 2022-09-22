package ALGO.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DEMO {

    public static void main(String[] args) {
        DEMO demo = new DEMO();
        System.out.println(demo.checkAnagram("SILENT", "LIMTEN"));
    }

    public boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            arr1 = sortArray(arr1);
            arr2 = sortArray(arr2);
            for(int i=0; i<arr1.length; i++){
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
            return true;
        }
    }

    public char[] sortArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
