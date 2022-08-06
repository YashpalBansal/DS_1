package com.company;

public class SortBubbleSort {
    public static void sortArray(int[] arr){
        int n = arr.length;
        while(n>0){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            n-=1;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,5,1,2,9,7,6,8,3,4,0,5};
        sortArray(arr);
    }
}
