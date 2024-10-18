package lv.rvt;

import java.util.*;

public class App 
{
  
  
  public static void main( String[] args ){
   
    Scanner scanner = new Scanner(System.in);
    printRectangle(17, 3);
    
  }
  
  public static void printRectangle(int width, int height) {
    for(int i = 0; i < height; i++){
      for(int k = 0; k < width; k++){
        System.out.print("*");
      }
      System.out.println("");

    }

    
  }

    
  

  
} 

