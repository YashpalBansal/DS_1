package com.company;

public class StringWordReverse {
    public static String reverseWord(String string){
        String str = "";
        String subStr = "";
        for(int i=0; i<string.length(); i++){

            if(string.charAt(i) == ' ') {
                str = str + subStr + ' ';
                subStr = "";
            }else{
                subStr = string.charAt(i)+ subStr;
            }
        }

        str = str + subStr;

        return str;

    }
    public static void main(String[] args) {
        String str = "abc def  ghi";
        System.out.println(reverseWord(str));
    }
}
