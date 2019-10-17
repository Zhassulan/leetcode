package kz.tele2.study;

import kz.tele2.study.LongestSubstringLen.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLongestSubstring {

    @Test
    public void testSolution()  {
        //String s = "abcabcbb"; //3
        String s = "bbbbb"; //1
        //String s = "pwwkew"; //3
        Solution solution = new Solution();
        assertEquals(1, solution.lengthOfLongestSubstring(s));
    }

}
