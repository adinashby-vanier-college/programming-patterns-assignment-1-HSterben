package com.progpatterns.assignment1;

import java.util.List;

/**
 * @author adinashby
 *
 */
public class Assignment1 {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {

    }

    /**
     * Please refer to the README file for question(s) description
     */
    public static String findLongestWord(String s, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                int length1 = list.get(i).length();
                int length2 = list.get(j).length();
                if (length1 > length2 || (length1 == length2 && list.get(i).compareTo(list.get(j)) < 0)) {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            boolean flag = true;
            String word = list.get(i);
            for (int j = 0; j < word.length(); j++) {
                if (!s.contains(word.charAt(i) + "")) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return word;
            }
        }

        return "";
    }

    public static boolean gcdSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                
            }
        }
        return false;
    }
    
    public static int findGcd(int num1, int num2) {
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num1; i != 1; i--) {
            if (num1 % i == 0 && num2 % i == 0)
                return i;
        }
        return 1;
    }
}
