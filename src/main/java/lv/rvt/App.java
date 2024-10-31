package lv.rvt;

import java.util.*;

public class App 
{
  
  
  public static void main( String[] args ){
   // int[] val = {0, 1, 2, 3}; 
    int sum = 0;
    // Uzzināt elementu skaitu masīva ?
    //for(int i = 0; i < val.length; i++){
      //System.out.println(val[i]);
   // }
    
   // for (int num = 0; num < val.length; num++) {
     // sum += val[num];
    //}

   // System.out.println("Sum of all numbers = " + sum);

    int[] val = {13, -4, 82, 17}; 
    int[] twice;
    twice = new int[val.length];

    for(int i = 0; i < val.length; i++){
      twice[i] = val[i] * 2;
    }
    
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    


 
    System.out.println( "New Array: " 
        + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );

    
  }
  
 

  

  
} 

