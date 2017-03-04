package com.javacode.stringcode;

import java.util.Scanner;

/**
 * Created by Opu on 3/4/2017.
 */
public class StringIntroduction {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();

        String c = a.concat(b);
        System.out.println(c.length());
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        String d = a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(d);
    }
}
