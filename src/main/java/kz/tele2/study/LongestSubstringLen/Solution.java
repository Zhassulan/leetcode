package kz.tele2.study.LongestSubstringLen;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        System.out.println("s = " + s);
        int n = s.length();
        System.out.println("n = " + n);
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                System.out.println("j = " + j);
                ans = Math.max(ans, j - i);
                System.out.println("j - i = " + (j - i));
                System.out.println("ans = " + ans);
            }
            else {
                set.remove(s.charAt(i++));
                System.out.println("i = " + i);
            }
            System.out.println("set:\n" + set.toString());
        }
        return ans;
    }

}
