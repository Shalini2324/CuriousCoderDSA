//https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1
/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode = new Node(x);
        
         // If list is empty
        if (head == null) {
            return newNode;
        }
        
        Node temp = head;

        // Move to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Insert at end
        temp.next = newNode;

        return head;
        
    }
}

