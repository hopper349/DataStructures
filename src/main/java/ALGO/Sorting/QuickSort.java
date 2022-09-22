package ALGO.Sorting;

public class QuickSort {

    public int[] sort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            sort(arr, low, partitionIndex - 1);
            sort(arr, partitionIndex + 1, high);
        }
        return arr;

    }

    public int partition(int[] arr, int low, int high) {
        int pivot = low;
        low = low + 1;

        while (low < high) {
            while (arr[low] <= arr[pivot] && low<high)  {
                low++;
            }
            while (arr[high] > arr[pivot] && low<high) {
                high--;
            }
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
        }
        int temp = arr[high];
        arr[high] = arr[pivot];
        arr[pivot] = temp;
        return high;
    }


    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] a = {9, 4, 2, 3, 6, 8, 4, 5, 2};
        int[] b= quickSort.sort(a, 0, a.length - 1);
        for(int i : b){
            System.out.print(i+" ,");
        }
    }
}
