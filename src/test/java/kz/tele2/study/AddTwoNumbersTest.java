package kz.tele2.study;

import kz.tele2.study.AddTwoNumbers.Solution;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    @Test
    public void test()  {
        Solution solution = new Solution();
        //int a[] = {2,4,3};
        //int b[] = {5,6,4};

        //int a[] = {3,1,0,0,1,9,0,1,6,1};
        //int b[] = {5,5,8,6,2,5,8,2,6,1};

        int a[] = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        int b[] = {5,6,4};
        solution.printListNode(solution.addTwoNumbers(solution.arrToListNode(a), solution.arrToListNode(b)));
    }

}
