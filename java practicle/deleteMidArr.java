// deleting an elemnt from the middle of an array
// shifting elements to fill empty space

import java.util.Scanner;

public class deleteMidArr {
    public static void main( String [] args){

    //dec and ini
     int [] arr = new int[10];
     int nElems = 5;

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter 5 values: ");

    //store usert inputs in an array
     for(int i=0; i<nElems; i++){    // 0 1 2 3 4
        arr[i] = sc.nextInt();
     }

     //display those values
     System.out.println("Before delete: ");
     for(int j=0; j<nElems; j++){
        System.out.print(arr[j] + " ") ;
     }

     System.out.println("\n Enter POS of element: ");
     int pos = sc.nextInt();

    //shifting(fill the postion --> left shift) ***important
    for(int k=pos+1 ; k < nElems; k++){
        arr[k-1] = arr[k];
    }

    nElems--;

    //display those values
     System.out.println("After deleted: ");
     for(int j=0; j<nElems; j++){
        System.out.print(arr[j] + " ") ;
     }

    }
}