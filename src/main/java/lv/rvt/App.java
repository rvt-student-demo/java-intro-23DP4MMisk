package lv.rvt;

import java.util.*;

public class App  
{ 
   public static void main( String[] args ){
    int[] val = {0, 1, 2, 3};
    int temp;

    for(int i = 0; i < val.length / 2; i++){
      temp = val[i];
      val[i] = val[val.length - 1 - i];
      val[val.length - 1 - i]  =  temp;
    }
    
    
    System.out.println( "Original Array: " 
    + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    
    System.out.println( "Reversed Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    
    
    
   

    
  }
  
} 

