public class insertArr{
 public static void main(String[]args){
 
//dec and ini
 int [] arr = {10,20,30,40,50};
//dispay
System.out.println("before insert");
 for(int i=0 ; i<arr.length ;i++){
 System.out.println(arr[i]+"");
 }
//insert in to 1st index
 arr[0] = 15;

//display
System.out.println("after insert");
for(int i=0 ; i<arr.length; i++){
System.out.println(arr[i]+"");
}
}
}
