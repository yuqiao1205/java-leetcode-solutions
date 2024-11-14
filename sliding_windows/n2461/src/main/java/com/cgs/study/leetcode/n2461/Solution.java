package com.cgs.study.leetcode.n2461;



public class Solution {

  static class ListNode {
    int value;
    ListNode next;

    // Constructor
    ListNode(int value) {
      this.value = value;
      this.next = null;
    }
  }

  // Class containing methods for reverse and print
  public static class ReverseLinkedList {

    // Method to reverse the linked list
    public static ListNode reverseList(ListNode head) {
      ListNode previous = null;
      ListNode current = head;
      ListNode next = null;

      // Iterate through the list and reverse the pointers
      while (current != null) {
        next = current.next; // Save next node
        current.next = previous;      // Reverse the pointer
        previous = current;           // Move previous forward
        current = next;               // Move current forward
      }

      return previous; // Return new head of the reversed list
    }

    // Method to print the linked list
    public static void printList(ListNode head) {
      ListNode current = head;
      while (current != null) {
        System.out.print(current.value + " -> ");
        current = current.next;
      }
      System.out.println("null");
    }
  }

  public int countNodes(ListNode head) {
    int count = 0;
    ListNode current = head;

    // Traverse the linked list and count the nodes
    while (current != null) {
      count++;
      current = current.next;
    }

    return count;
  }

  // Test the solution with the main method
  public static void main(String[] args) {
    // Create a linked list: 1 -> 2 -> 3 -> 4 -> null
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);

    System.out.println("Original Linked List:");
    ReverseLinkedList.printList(head);

    // Reverse the linked list
    ListNode reversedHead = ReverseLinkedList.reverseList(head);

    System.out.println("Reversed Linked List:");
    ReverseLinkedList.printList(reversedHead);

    // Count the number of nodes in the linked list
    Solution solution = new Solution();
    int count = solution.countNodes(reversedHead);
    System.out.println("Number of nodes in the linked list: " + count);
  }
}
