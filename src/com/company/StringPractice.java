package com.company;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        str = s.next();
        String str2;
        str2 = s.nextLine();

        System.out.println(str+" "+ str.length());
        System.out.println(str2+" "+str2.length());
    }
}
