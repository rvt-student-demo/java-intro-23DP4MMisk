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

   int[] valA  = { 13, -22,  82,  17}; 
   int[] valB  = {-12,  24, -79, -13};
   int[] sumC  = {  0,   0,   0,   0};
   
   for(int i = 0; i < sumC.length; i++) {
     sumC[i] = valA[i] + valB[i];
   }




   System.out.println( "sum: " 
       + sumC[0] + " " + sumC[1] + " " + sumC[2] + " " + sumC[3] );

    
  }
  
 

  

  
} 

