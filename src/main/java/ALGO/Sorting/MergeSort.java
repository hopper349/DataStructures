package ALGO.Sorting;

public class MergeSort {

    public int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        } else {
            int mid = arr.length / 2;
            int[] left = new int[mid];
            int[] right = new int[arr.length - mid];
            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, arr.length - mid);
            left  = sort(left);
            right = sort(right);
            return merge(left,right);
        }

    }

    public int[] merge(int[] left, int[] right) {
        int i = 0, j = 0;
        int len = left.length + right.length;
        int[] merged = new int[len];
        int counter=0;

        while (i < left.length && j < right.length) {
            if(left[i] >= right[j]){
                merged[counter] = right[j];
                counter++;
                j++;
            }
            else{
                merged[counter] = left[i];
                counter++;
                i++;
            }
        }
        if(i<left.length){
            System.arraycopy(left,i,merged,counter,left.length-i);
        }
        else if(j<right.length){
            System.arraycopy(right,j,merged,counter,right.length-j);
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] a = {1,9,4,100,2,3,6,8,4,5,2};

        MergeSort mergeSort = new MergeSort();
        int [] b= mergeSort.sort(a);
        for(int i : b){
            System.out.print(i+" ,");
        }
    }
}
