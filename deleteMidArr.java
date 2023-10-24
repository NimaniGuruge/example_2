import java.util.Scanner;
public class deleteMidArr{
 public static void main(String[]args){
 
 int[]arr = new int[10];
  int nElems = 5;
 Scanner sc = new Scanner(System.in);

 System.out.println("Enter 5 value:");

 // store value
 for(int i=0; i<nElems; i++){
 arr[i] = sc.nextInt();
 }

//display
 System.out.println("Before Delete:");
 for(int j=0; j<nElems; j++){
 System.out.println(arr[j] + "");
 }
 
 System.out.println("Enter POS of Element:");
 int pos = sc.nextInt();

//Shifting
 for(int k=pos+1; k<nElems; k++){
 arr [k-1] = arr [k];
 }
 nElems--;
 
 System.out.println("After Delete:");
 for(int j=0; j<nElems; j++){
 System.out.println(arr[j] +"");
 }
 }
}
 
 
 
 