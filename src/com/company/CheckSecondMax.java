package com.company;

public class CheckSecondMax{

    public static int findSecondMaximum(int[] arr){
        int max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            if(max<arr[i]){
                s_max = max;
                max = arr[i];
            }
            if(arr[i]<max && s_max<arr[i]){
                s_max = arr[i];
            }
        }
        return s_max;
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

        int[] arr = {-2, -33, -10, -456};
        System.out.println("Array: " + arrayToString(arr));
        int secMax = findSecondMaximum(arr);
        System.out.println("Second maximum: " + secMax);

    }
}
