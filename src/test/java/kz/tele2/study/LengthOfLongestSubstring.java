package kz.tele2.study;

import kz.tele2.study.LongestSubstringLen.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLongestSubstring {

    @Test
    public void testSolution()  {
        assertEquals(3, new Solution().lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void testSolution1()  {
        assertEquals(1, new Solution().lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void testSolution2()  {
        assertEquals(3, new Solution().lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void testSolution3()  {
        assertEquals(0, new Solution().lengthOfLongestSubstring(""));
    }

    @Test
    public void testSolution4()  {
        assertEquals(2, new Solution().lengthOfLongestSubstring("au"));
    }

    @Test
    public void testSolution5()  {
        assertEquals(3, new Solution().lengthOfLongestSubstring("abc"));
    }

    @Test
    public void testSolution6()  {
        assertEquals(5, new Solution().lengthOfLongestSubstring("hkcpmprxxxqw"));
    }


}
