package com.company;

public class ArraySwapAlternate {
    public static void swap(int[] arr){
        int n = arr.length;


        for(int i=0;i<n-1;i+=2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 9, 3, 10, 15, 11};
        swap(arr);
    }
}
