package com.company;

public class StringSubString {
    public static void subString(String str){
        for(int i = 0; i<str.length();i++){
            for(int j = i+1; j < str.length();j++){
                for(int k = i; k<=j;k++){
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        subString("abcd");
    }
}
