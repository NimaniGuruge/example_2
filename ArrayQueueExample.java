class ArrayQueue{
private int maxsize;
private int[]queueArray;
private int front;
private int rear;
private int nItems;

public ArrayQueue(int size){
maxsize = size;
queueArray = new int[maxsize];
front = 0;
rear = -1;
nItems = 0;
}

public boolean isEmpty(){
return nItems==0;
}

public boolean isFull(){
return nItems==maxsize;
}

public int size(){
return nItems;
}

public void enqueue(int data){
if(isFull()){
System.out.println ("queue is full cannot enqueue");
return ;
}
rear = rear + 1;
queueArray[rear] = data;
nItems++;
}

public int dequeue(){
if(isEmpty()){
System.out.println ("queue is empty cannot dequeue");
return -1;
}
int data = queueArray[front];
front = front + 1;
nItems--;
return data;
}

public int peekfront(){
if(isEmpty()){
System.out.println ("queue is empty cannot peek");
return -1;
}
return queueArray[front];
}
}

public class ArrayQueueExample {
public static void main(String[]args){
ArrayQueue queue = new ArrayQueue(5);

queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);

int frontElement = queue.peekfront();
if(frontElement !=-1){
System.out.println("front element:"+frontElement);
}
while(!queue.isEmpty()){
int dequeueElement = queue.dequeue();
System.out.println("dequeue:"+ dequeueElement);
}
System.out.println("is the queue is empty?" + queue.isEmpty());
}
}