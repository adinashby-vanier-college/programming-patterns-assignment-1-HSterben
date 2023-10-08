package com.progpatterns.assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
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
    
    
    /*
    I use a bubble sort algorithm which has a Big O notation of
    Worst Case: O(n^2)
    Best Case: O(n)
    The space complexity is O (1)
    I also use two nested for loops which has a Big O notation of
    Worst case: O (m) where m = length of string
    
    Overall Time Complexity:
    Combining the two segments, the time complexity is O (n^2 + m)
    
    Space Complexity
    There's no additional data structure that grows with the input size.
    So that means the space complexity is O(1)
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
    
    /*
    1. Initialization
    O(1)
    2. Adding elements to boolArray
    O(length)
    3. Adding elements to Array
    O(max)
    4. Splitting method
    O(sqrt(x))
    5. Sorted nums array
    O(length)
    6. Checking each element
    O(log(max))
    
    Overall time complexity is
    O(1)+ O(length)+ O(max)+ O(max*x)+ O(lengthloglength)+ O(length*logmax).
    
    Space Complexity:
    The space complexity is determined by the space used
    which includes array and boolArray each of size max + 1, and sorted of size length.
    The overall space complexity is O(max + length).
    */

    public static boolean gcdSort(int[] nums) {
        int max = 100000;
        int[] array = new int[max + 1];
        boolean[] boolArray = new boolean[max + 1];
        int length = nums.length;
        
        for (int i = 0; i < length; i++) {
            boolArray[nums[i]] = true;
        }
        
        for (int i = 1; i <= max; i++) {
            array[i] = i;
        }
        
        for (int i = 1; i <= max; i++) {
            if (boolArray[i]) {
                splitting(array, i);
            }
        }
        int[] sorted = new int[length];
        System.arraycopy(nums, 0, sorted, 0, length);
        Arrays.sort(sorted);
        
        for (int i = 0; i < length; i++) {
            if (find(array, sorted[i]) != find(array, nums[i])) {
                return false;
            }
        }
        return true;
    }

    public static int find(int[] array, int index) {
        
        if (array[index] != index) {
            array[index] = find(array, array[index]);
        }
        return array[index];
    }

    public static void splitting(int[] array, int x) {
        
        int y = x;
        
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                while (x % i == 0) {
                    x /= i;
                    link(array, y, i);
                }
            }
        }
        
        if (x != 1) {
            link(array, y, x);
        }
    }

    public static void link(int[] array, int index1, int index2) {
        
        array[find(array, index1)] = find(array, index2);
    }

    public static int gcd(int num1, int num2) {
        
        while (num2 != 0) {
            int temp = num1;
            num1 = num2;
            num2 = temp % num2;
        }
        
        return num1;
    }

}
