package com.javacode.stringcode;

import java.util.Scanner;

/**
 * Created by noman on 1/4/18.
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        /**
         * The reverse() method returns a StringBuilder object, not a String. Since the equals() method expects an
         * Object, the compiler won't complain if you pass a StringBuilder object, but then you're comparing a String
         * object to a StringBuilder object, so they'll never be equal. To illustrate, try using equalsIgnoreCase()
         * which expects a String, so the compiler will complain if you don't add the toString() after reverse()...
         * **/

        System.out.println(str.equals(new StringBuilder(str).reverse().toString()) ? "Yes" : "No");
    }
    /**
     * Imagine we want to test one million words from a dictionary to see how many palindroems there are in a language.
     * You solution will reverse ALL the pairs of letters in each word. If a word is 50 letters long, it will reverse
     * 25 pairs of letters.

     Why do the test on ALL the pairs of letters? Only perhaps 10 000 words out of a million will be palindromes,
     but this algorithm will reverse all the letters in all the words! How about writing a code that will just test
     if a given pair of letters is identical (no reversing either!) and will quit testing immediately after the pair of
     letters which are not identical? This test will do the job:

     if (word.charAt(first) != word.charAt(last))
     return "No";
     }

     Time performance of your solution will be n * (k / 2)
     (n is number of words, k is number of letters in each word.) It will be proportional to the number of LETTERS in
     the dictionary.

     Time performance of my solution will be closer to n (the number of WORDS in the dictionary) because most words turn
     out NOT to be palindromes after 1-3 checks. So, for a million words the user should feel the difference. And what if
     you wanted to compare the number of palindormes in all dictionaries of all languages? (:-) For the processor and
     ... the user, BEAUTY IS SPEED.
     * **/
  /*  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String result = isPalindrome(str,0,str.length()-1);
        System.out.println(result);
    }
    public static String isPalindrome(String word, int first, int last){
        if(word == null || "".equals(word)){
            return "The String is null or empty";
        }
        return isPalindRecursive(word.toLowerCase(),first,last);
    }

    private static String isPalindRecursive(String word, int first, int last) {
        if(first >= last){
            return "Yes";
        }
        if(word.charAt(first) != word.charAt(last)){
            return "No";
        }
        return isPalindRecursive(word,++first,--last);
    }*/
}
