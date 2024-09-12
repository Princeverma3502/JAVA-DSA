package LinkedList;


public class firstProgram {

  public static void displayrecursive(Node head){
    if(head == null){
      return;
    }
    System.out.print(head.data + " ");
    displayrecursive(head.next);
  }

  public static void display(Node head){   // we will not use a instead of head because to it will stop reprinting of list...//
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }



  public static class Node{
    int data;  // value
    Node next; // addrees of next node
    Node(int data){
      this.data = data;
    }
  }

  public static void main(String[]args){
    Node a = new Node(5);
    Node b = new Node(3);
    Node c = new Node(9);
    Node d = new Node(8);
    Node e = new Node(16);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    System.out.println(a.data);
    System.out.println(a.next.data);
    System.out.println(a.next.next.data);
    System.out.println(a.next.next.next.data);
    System.out.println(a.next.next.next.next.data);
    
                 // OR
    Node tempo = a;
    for(int i=1; i<=5; i++){    // when number of terms are known..
      System.out.print(tempo.data + " ");
      tempo = tempo.next;

    }
    System.out.println();

                    // OR
    Node temp = a;
    while(temp != null){     // to print when number of terms is not known..
      System.out.print(temp.data +" ");
      temp  = temp.next;
    }

    System.out.println();
    display(a);
    System.out.println();
    displayrecursive(a);
  
  }
  
}
