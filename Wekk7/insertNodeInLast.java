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

//online compiler
import java.util.Scanner;
class Node{
    int data;
    Node next;
}
class Main {
    public static void main(String[] args) {
        Node head = null;
        Node temp = null;
        Scanner sc = new Scanner(System.in);
        int n = 5;
        while(n>0){
            if(head==null){
                head = new Node();
                head.data = sc.nextInt();
                head.next = null;
                temp = head;
            } else{
                Node temp1 = new Node();
                temp1.data = sc.nextInt();
                temp1.next = null;
                temp.next = temp1;
                temp = temp1;
            }
            n--;
        }
        temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
