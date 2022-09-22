package ALGO.Sorting;

public class BubbleSort {

    public void sort(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0; j <arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i : arr){
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] a = {1,9,4,2,3,6,8,4,5,2};
        bubbleSort.sort(a);
    }
}
