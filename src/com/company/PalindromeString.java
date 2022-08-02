package com.company;

public class PalindromeString {
    public static String palidromeChecked(String str){
        int i = 0;
        int j = str.length() - 1;

        while(i<j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                return "No";
            }
        }

        return "Yes";
    }
    public static void main(String[] args) {
        System.out.println(palidromeChecked("1abcba1"));
    }
}
