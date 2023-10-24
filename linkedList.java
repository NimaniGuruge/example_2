class Node {
 int data;
 Node next;

 public Node(int data){
 this.data = data;
 this.next = null;
 }
}
 class LinkedList{
 Node head;
 
 // create LL
 public void create(){
  Node p = new Node(50);
  Node q = new Node(60);
  Node r = new Node(70);
  Node s = new Node(80);

 head = p;
 //linking
 p.next = q;
 q.next = r;
 r.next = s;
 }


//printLL
 public void printList(){
 Node ptr;
 ptr = head;
 while (ptr!=null){
 System.out.println(ptr.data + "");
 ptr = ptr.next;
 }
System.out.println();
}
}

public class linkedList{
 public static void main(String []args){
 
 linkedList list = new linkedlist ();
 list.create();
 System.out.println("LL:"); 
 list.printList();
 }
}
 