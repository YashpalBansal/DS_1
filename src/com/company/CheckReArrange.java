package com.company;

public class CheckReArrange {

    public static void reArrange(int arr[]){
        int[] arr2 = new int[arr.length];

        int s_index = 0;
        int l_index = arr.length - 1;

        for(int i = 0; i< arr.length; i++){
            if(arr[i]<0){
                arr2[s_index++] = arr[i];
            }else{
                arr2[l_index--] = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i ++){
            arr[i] = arr2[i];
        }

    }

    public static void main(String args[]) {

        int[] arr = {2, 4, -6, 8, -5, -10};

        System.out.print("Array before re-arranging: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        reArrange(arr);

        System.out.print("Array after rearranging: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}