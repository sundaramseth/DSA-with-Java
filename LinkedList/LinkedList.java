import java.util.*;

public class AddFirstInLinkedList{

// A linked list node
  public static class Node{
    int data;
    Node next;

   // Constructor to initialize a new node with data
    Node(int val){
        this.data = val;
        this.next = null;
    }
  }


    public static void printList(Node head) {
        // Loop that runs till head is null
        while (head != null) {

            // Printing current node data
            System.out.print(" " + head.data);

            // Moving to the next node in the list
            head = head.next;
        }
        System.out.println();
    }

// Driver code
  public static void main(String[] args){

       // Create a hard-coded linked list:
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(30);
    Node n4 = new Node(40);
    Node n5 = new Node(50);
        Node n6 = new Node(770);
            Node n7 = new Node(660);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;
    n6.next = n7;

    Node head = n1;

    // head = addFirst(head, 55);

      // head = addLast(head, 75);

            // head = addAt(head, 905, 4);

          //  head =  RemoveFirst(head);

          //  head = RemoveLast(head);

          //  head = RemoveAt(head, 2 );

           head = SearchK(head, 40);

        Node middle = MidOfLL(head);
        System.out.println("Middle element: " + middle.data);


  // Printing the above list
    printList(head);




  }

// add elemnt to head
  public static Node addFirst(Node head, int val){

    Node n = new Node(val);

    n.next = head;
    head = n;
    return head;

  }


// add elemnt to tail
  public static Node addLast(Node head, int val){

    Node n = new Node(val);

    Node tail = head;

    while(tail.next != null){
      tail = tail.next;
    }

    tail.next = n;
    return head;

  }


  // add elemnt to at anny position
  public static Node addAt(Node head, int val, int idx){

    if(head == null){
      addFirst(head, val);
    }

    Node n = new Node(val);

    Node temp = head;

    for(int i=0; i< idx -1; i++){
      temp = temp.next;
    }

    Node temp1 = temp.next;
    temp.next = n;
    n.next = temp1;
    return head;
  }

// Remove first element from list
  public static Node RemoveFirst(Node head){

    if(head == null){
      return null;
    }

    head = head.next;

    return head;
  }


// Remove last element from list
  public static Node RemoveLast(Node head){

    if(head == null){
      return null;
    }

    Node tail = head;
    while(tail.next.next != null){
      tail = tail.next;
    }

    tail.next = null;
    return head;
  
  }

// Remove any element from the list
  public static Node RemoveAt(Node head, int idx){

  if(idx == 0){
    return RemoveFirst(head);
  }

  Node temp = head;

  for(int i=1; i< idx - 1; i++){
    temp = temp.next;
  }

  Node temp1 = temp.next.next;

  temp.next = temp1;

  return head;

}

// Search element in linked list

public static Node SearchK(Node head, int k){

  Node temp = head;

  while(temp != null){
    if(temp.data == k){
      return head;
    }
    temp = temp.next;
  }

  return null;
}

// Return mid of linked list 

public static Node MidOfLL(Node head){


  Node Slow = head;

  Node Fast = head;

  while(Fast != null && Fast.next != null){
    Fast = Fast.next.next;
    Slow = Slow.next;
  }

  return Slow;
}

}


