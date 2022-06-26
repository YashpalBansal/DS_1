package com.company;

public class CheckRemoveEven {

    public static int[] removeEven(int[] arr) {

        int oddElements = 0;
        // Write - Your - Code- Here
        for(int i = 0; i< arr.length; i++){
            if(arr[i]%2!=0){
                oddElements++;
            }
        }

        int arr2_index=0;
        int[] arr2 = new int[oddElements];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]%2!=0) {
                arr2[arr2_index++] = arr[i];
            }
        }
        return arr2; // change this and return the correct result array
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 10, 6, 3};
        int[] arr2 =  removeEven(arr);
        for(int i = 0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
