package com.company;

public class CheckMergeArray {
    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] mergedArray = new int[arr1.length+arr2.length];

        int arr1_index = 0;
        int arr2_index = 0;
        int i = 0;
        try {
            while (arr1_index <= arr1.length - 1 && arr2_index <= arr2.length - 1) {
                if (arr1[arr1_index] < arr2[arr2_index]) {
                    mergedArray[i++] = arr1[arr1_index++];
                } else {
                    mergedArray[i++] = arr2[arr2_index++];
                }
            }
            while (arr1_index <= arr1.length - 1) {
                mergedArray[i++] = arr1[arr1_index++];
            }
            while (arr2_index <= arr2.length - 1) {
                mergedArray[i++] = arr2[arr2_index++];
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array out bound");
        }
        return mergedArray;
    }
    public static void main(String args[]) {

        int[] arr1 = {1,12,14,17,23}; // creating a sorted array called arr1
        int[] arr2 = {11,19,29};  // creating a sorted array called arr2

        int[] resultantArray = mergeArrays(arr1, arr2); // calling mergeArrays

        System.out.print("Arrays after merging: ");
        for(int i = 0; i < arr1.length + arr2.length; i++) {
            System.out.print(resultantArray[i] + " ");
        }
    }
}
