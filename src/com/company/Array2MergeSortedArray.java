package com.company;

public class Array2MergeSortedArray {

    public static int binarySearch(int[] arr, int n){

        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(n==arr[mid]){
                return mid;
            }else if(n < arr[mid]){
                System.out.println(mid);
                high = mid-1;

            }else{
                System.out.println(mid);
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,10,13};
        int[] arr2 = {};
        System.out.println(binarySearch(arr, 20));

    }
}
