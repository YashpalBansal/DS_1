package com.company;

public class arrayPattern1 {

    public static int[] array1(int n){
        int arr[] = new int[n];

        int i = 0;
        int j = n-1;
        int count = 1;
        while(i<=j){
            if(count%2==0){
                arr[j] = count;
                count++;
                j--;
            }else{
                arr[i] = count;
                count++;
                i++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = array1(1);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
