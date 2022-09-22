package ALGO.Sorting;

public class InsertionSort {

    public void sort(int arr[]) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int key= arr[i];
            int j = i-1;
            while( j >=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        for(int i : arr){
            System.out.print(i+" , ");
        }
    }
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] a = {1,9,4,2,3,6,8,4,5,2};
        insertionSort.sort(a);
    }
}
