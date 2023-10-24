import java.util.Scanner;

public class insertMidArr{
 public static void main(String[]args){
 
 //dec and ini
 int[] arr = new int[10];
 int nElems = 5;
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter 5 values:");
 // store value
 for(int i=0;i<nElems;i++){
 arr[i] = sc.nextInt();
 }
 // display those value
 System.out.println("Before insert :");
 for(int j=0;j<nElems;j++){
 System.out.println(arr[j]+"");
 }
 //set pos
 System.out.println("Enter POS of new element:");
 int pos = sc.nextInt();

 // set value
 System.out.println("Enter VAL of new element:");
 int val = sc.nextInt();
 
 //shifting to get an empty space(from the end)
 for(int k = nElems-1 ; k>=pos ; k--){
 arr[k+1] = arr[k];
 }
 arr [pos] = val;
 nElems++;
 
 //display those value
 System.out.println("Afer insert:");
 for(int j=0;j<nElems;j++){
 System.out.println(arr[j]+"");
 }
 
 }
}
 
 
 
 
 
 