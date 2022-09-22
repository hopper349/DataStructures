package ALGO.Sorting;

public class SelectionSort {

    public void sort(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i: arr){
            System.out.print(i+" , ");
        }
    }


    public static void main(String[] args) {
        int[] a = {1,9,4,100,2,3,6,8,4,5,2};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(a);
    }
}
