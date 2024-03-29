package com.company;

public class CheckFirstUnique {

    public static int findFirstUnique(int[] arr){

        boolean isRepeated = false;
        for(int i = 0; i<arr.length; i++){
            for(int j=0;j<arr.length; j++){
                if(arr[i]==arr[j] && i!=j){
                    isRepeated = true;
                    break;
                }
            }
            if(isRepeated == false){
                return arr[i];
            }
            else{
                isRepeated = false;
            }
        }

        return -1;
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
    public static void  main(String args[]) {

        int[] arr = {2, 54, 7, 2, 6, 54};

        System.out.println("Array: " + arrayToString(arr));

        int unique = findFirstUnique(arr);
        System.out.print("First Unique in an Array: " + unique);

    }
}
