package kz.tele2.study;

import kz.tele2.study.TwoSum.Solution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void printTest() {
        int a = 112;
        System.out.println(a);
    }

    @Test
    public void testTwoSum()    {
        int nums [] = {2, 7, 11, 15};
        int target = 9;
        Solution twoSum = new Solution();
        twoSum.print(nums);
        System.out.println(target);
        twoSum.print(twoSum.solution(nums, target));
        assertArrayEquals(twoSum.solution(nums, target), new int [] {0, 1});
    }
}
