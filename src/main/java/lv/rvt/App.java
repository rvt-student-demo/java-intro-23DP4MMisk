package lv.rvt;

import java.util.*;

public class App 
{
  
  
  public static void main( String[] args ){
   
    Scanner scanner = new Scanner(System.in);
    printTriangle(4);
    christmasTree(4);
    christmasTree(10);
    
  }
  
  public static void printTriangle(int size) {
    for (int i = 1; i <= size; i++) {
        printSpaces(size - i); 
        printStars(i);         
        System.out.println();  
    }
 }

 public static void printSpaces(int count) {
    for (int j = 0; j < count; j++) {
        System.out.print(" "); 
    }
 } 

 public static void printStars(int count) {
    for (int k = 0; k < count; k++) {
        System.out.print("*"); 
    }
  }

  public static void christmasTree(int height) {
    for (int k = 1; k <= height; k++) {
      printSpaces(height - k);
      printStars(2 * k - 1);
      System.out.println();
    }
    
    for(int k = 0; k < 2; k++) {
      printSpaces(height - 2);
      printStars(3);
      System.out.println();
    }  
  
  }


  

  
} 

