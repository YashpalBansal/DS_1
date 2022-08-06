package com.company;

public class SortSelectionSort {
    public static void sortArray(int[] arr){
        int minIndex = 0;

        for(int i = 0;i<arr.length-1;i++){
            for(int j = i;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                    System.out.println("--"+minIndex+"--");
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,1,2,-9,7,6,-8,3,4,0,5};
        sortArray(arr);
    }
}
