package LinkedList;

public class findLength {

  public static void display(Node head){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public static int length(Node head){
    int count = 0;
    while(head != null){
      count++;
      head = head.next;
    }
    return count;
  }

  public static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }

  public static void main(String[]args){
    Node a = new Node(5);
    Node b = new Node(7);
    Node c = new Node(9);
    Node d = new Node(11);
    Node e = new Node(13);  

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
     
    display(a);
    System.out.println();
    System.out.println(length(a));

  }
  
}
