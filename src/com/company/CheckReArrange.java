package com.company;

public class CheckReArrange {

    public static void reArrange(int arr[]){
        int[] arr2 = new int[arr.length];

        int s_index = 0;
        int l_index = arr.length - 1;

//        for(int i = 0; i< arr.length; i++){
//            if(arr[i]<0){
//                arr2[s_index++] = arr[i];
//            }else{
//                arr2[l_index--] = arr[i];
//            }
//        }
//
//        for(int i = 0; i < arr.length; i ++){
//            arr[i] = arr2[i];
//        }

        while(s_index<l_index){
            if(arr[s_index]>0){
                while(arr[l_index] > 0 && s_index<l_index){
                    l_index--;
                }
                int temp = arr[l_index];
                arr[l_index] = arr[s_index];
                arr[s_index] = temp;
            }
            s_index++;
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
