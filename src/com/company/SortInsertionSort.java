package com.company;

public class SortInsertionSort {
    public static void sortArray(int[] arr){
        int n = arr.length;
        int i = 1;

        while(i!=n){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
            i+=1;
        }

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,5,1,2,9,7,6,8,3,4,0,5};
        sortArray(arr);
    }
}
