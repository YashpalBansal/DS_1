package com.company;

public class ProductArray {
    public static int[] findProduct(int arr[]){
        return arr;
    }

    public static String arrayToString(int arr[]){
        if (arr.length > 0){
            String result = "";
            for(int i = 0; i < arr.length; i++) {
                result += arr[i] + " ";
            }
            return result;
        }
        else {
            return "Empty Array!";
        }
    }
    public static void main(String args[]) {
        int[] arr = {-1, 2, -3, 4, -5};
        System.out.println("Array before product: " + arrayToString(arr));
        int[] prodArray = findProduct(arr);
        System.out.println("Array after product: " + arrayToString(prodArray));
    }
}