package com.javacode.stringcode;

import java.util.Scanner;

/**
 * Created by noman on 1/5/18.
 */
public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        Integer start = in.nextInt();
        Integer end = in.nextInt();
//        if(str.length() >=1 && str.length()<=100){
//            System.out.println(str.substring(start,end));
//        }
        String str2="";
        for(int i=start;i<end;i++){
            str2 += str.charAt(i);
        }
        System.out.println(str2);
    }
}
