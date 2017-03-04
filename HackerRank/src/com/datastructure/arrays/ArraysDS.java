package com.datastructure.arrays;

import java.util.Scanner;

/**
 * Created by Opu on 3/4/2017.
 */
public class ArraysDS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
