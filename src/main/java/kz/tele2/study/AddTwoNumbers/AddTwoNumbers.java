package kz.tele2.study.AddTwoNumbers;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */

import java.math.BigInteger;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return null;
        BigInteger a = new BigInteger(reverseString(getNumberAsString(l1)));
        BigInteger b = new BigInteger(reverseString(getNumberAsString(l2)));
        BigInteger sum = a.add(b);
        String sumAsString = reverseString(String.valueOf(sum));
        System.out.println("Sum string is " + sumAsString);
        return strToListNode(sumAsString);
    }

    private ListNode strToListNode(String strIn)    {
        ListNode resListNode = null;
        ListNode lastListNode = null;
        String[] arrOfStr = strIn.split("(?!^)");
        int i = 0;
        for (String str : arrOfStr)   {
            if (i++ == 0) {
                resListNode = new ListNode(Integer.valueOf(str));
                lastListNode = resListNode;
            } else {
                lastListNode.next = new ListNode(Integer.valueOf(str));
                lastListNode = lastListNode.next;
            }
        }
        return resListNode;
    }

    private String getNumberAsString(ListNode listNode) {
        String num = "";
        boolean b = true;
        int i = 0;
        ListNode curListNode = null;
        if (listNode != null)
            while (b) {
                if (i++ == 0) {
                    num = num + String.valueOf(listNode.val);
                    curListNode = listNode.next;
                } else {
                    if (curListNode != null) {
                        num += String.valueOf(curListNode.val);
                        curListNode = curListNode.next;
                    } else b = false;
                }
            }
        //printListNode(listNode);
        //System.out.println("\nGot number from node - " + num);
        return num;
    }

    private String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public void printListNode(ListNode listNode) {
        System.out.println("Printing collection:");
        System.out.print("[");
        boolean b = true;
        int i = 0;
        if (listNode != null)
            while (b) {
                if (i++ == 0) {
                    System.out.print(String.valueOf(listNode.val) + " ");
                    if (listNode.next != null)
                        listNode = listNode.next;
                } else {
                    if (listNode != null) {
                        System.out.print(String.valueOf(listNode.val) + " ");
                        if (listNode.next != null)
                            listNode = listNode.next;
                        else b = false;
                    } else b = false;
                }
            }
        System.out.print("]");
    }

    public ListNode arrToListNode(int arr[]) {
        ListNode node = null;
        ListNode lastNode = null;
        for (int i = 0; i < arr.length; i++)    {
            if (node == null)   {
                node = new ListNode(Integer.valueOf(String.valueOf(arr[i])));
                lastNode = node;
            }   else    {
                ListNode newNode = new ListNode(Integer.valueOf(String.valueOf(arr[i])));
                lastNode.next = newNode;
                lastNode = newNode;
            }
        }
        return node;
    }

}
