package kz.tele2.study.LongestSubstringLen;

/*
Given a string, find the length of the longest substring without repeating characters.

        Example 1:

        Input: "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
*/

import java.util.HashSet;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s == "" || s == null)    {
            return 0;
        }
        System.out.println("s = " + s);
        int n = s.length();
        int l_max = n;
        System.out.println("n = " + n);
        int k = 0, i = 0, j = 0;
        String sub = null, searchStr = null;
        for (k = 0; k < n; k++) {
            System.out.println("----------------------------");
            System.out.println("k = " + k);
            for (i = 0; i < n - k; i++) {
                System.out.println("i = " + i);
                sub = s.substring(i, i + k + 1);
                System.out.println("l_max = " + l_max);
                System.out.println("sub = " + sub);
                if (k > 0)  {
                    if (firstRepeating(sub))
                        continue;
                }
                searchStr = s.substring(i + k + 1, n);
                System.out.println("searchStr = " + searchStr);
                if (searchStr.length() < sub.length())  {
                    l_max = k + 1;
                    continue;
                }
                if (searchStr.contains(sub)) {
                    l_max = k + 1;
                    System.out.println("found, l_max = " + l_max);
                }   else    {
                    l_max = sub.length();
                }
            }
        }
        return l_max;
    }

    boolean firstRepeating(String s)  {
        char arr [] = s.toCharArray();
        // Creates an empty hashset
        HashSet<Character> h = new HashSet<>();
        // Traverse the input array from left to right
        for (int i = 0; i <= arr.length - 1; i++) {
            char c = arr[i];
            // If element is already in hash set, update x
            // and then break
            if (h.contains(c)) {
                System.out.println("dublicate letter \"" + c + "\"");
                return true;
            }
            else // Else add element to hash set
                h.add(c);
        }
        return false;
    }

}
