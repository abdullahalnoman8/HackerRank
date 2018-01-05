package com.javacode.stringcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by noman on 1/5/18.
 */
public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();

//        isAnagram(a,b);
//        boolean ret = isAnagram(a,b);
//        if(ret){
//            System.out.println("Anagram");
//        }else{
//            System.out.println("No Anagram");
//        }
        System.out.println(isAnagram(a,b) ? "Anagram" : "Not Anagrams");
    }
    public static boolean isAnagram(String a,String b){
        // test for invalid input
        if(a==null || b== null || "".equals(a) || "".equals(b)){
            throw new IllegalArgumentException();
        }

        // initial quick test for non-anagrams
        if(a.length() != b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Populate a map with letters and frequencies of string b
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i <b.length() ; i++) {
            char letter = b.charAt(i);

            if(!map.containsKey(letter)){
                map.put(letter,1);
            }else{
                Integer frequency = map.get(letter);
                map.put(letter,++frequency);
            }
        }

        // test each letter in String a against data in the map
        // return if letter is absent in the map or its frequency is 0
        // otherwise decrease the frequency by 1

//        System.out.println("Map Data:"+map);

        for (int i = 0; i <a.length() ; i++) {
            char letter = a.charAt(i);
//            System.out.println(letter);
            if(!map.containsKey(letter)){
                return false;
            }

            Integer frequency = map.get(letter);

            if(frequency == 0){
                return false;
            }else{
                map.put(letter,--frequency);
            }
        }
//        System.out.println("After Check: "+map);
        // if the code got that far is anagram
        return true ;

    }
}
