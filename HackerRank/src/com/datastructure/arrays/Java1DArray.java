package com.datastructure.arrays;

import java.util.Scanner;

/**
 * Created by noman on 12/23/17.
 */
public class Java1DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Integer[] array = new Integer[n];

        for (int i=0;i<array.length;i++){
            int val = scanner.nextInt();
            array[i] = val;
        }
        scanner.close();
        for (Integer arr: array) {
            System.out.println(arr);
        }
    }
}
