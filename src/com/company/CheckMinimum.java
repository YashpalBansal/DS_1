package com.company;

public class CheckMinimum {
    public static int findMinimum(int[] arr){
        int minimun = arr[0];
        return minimun;
    }
    public static void main(String args[]) {

        int[] arr = { 9, 2, 3, 6};

        System.out.print("Array : ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        int min = findMinimum(arr);
        System.out.println("Minimum in the Array: " + min);

    }
}
