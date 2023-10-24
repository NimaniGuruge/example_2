class ListNode<T>{
T data;
ListNode<T>next;

public ListNode(T data){
this.data = data;
this.next= null;
}
}

public class LinkedListQueue<T>{
private ListNode<T> front;
private ListNode<T> rear;

public LinkedListQueue(){
front = rear = null;
}

public boolean isEmpty(){
return front==null;
}

public void enqueue(T data){
ListNode<T>newNode = new ListNode<>(data);
if(isEmpty()){
front= rear= newNode;
}else
{
rear.next = newNode;
rear = newNode;
}
}

public <T> dequeue(){
if(isEmpty());
System.out.println ("Queue is empty cannot dequeue");
return null;
}
T data = front.data;
front = front.next;
if(front==null){
rear==null;
}
return data;
}

public T peekfront(){
if(isEmpty()){
System.out.println("queue is empty cannot peek");
return null;
}
return front.data;
}

public void makeEmpty(){
front= rear= null;
}

public int size(){
int count =0;
ListNode<T>current=front;
while(current!=null){
count++;
current = current.next;
}
return count;
}
}
public class LinkedListQueueExample{
public static void main(String[]args){
LinkedListQueue<int>queue = new LinkedListQueue<>();

queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);

int frontElement = queue.peekfront();
if(frontelement !=null){
System.out.println("front Element:"+ frontElement);
}

while(!queue.isEmpty()){
int dequeuedElement = queue.dequeue();
System.out.println("dequeued"+dequeuedElement);
}
System.out.println("is the queue empty?"+queue.isEmpty());
}
}


