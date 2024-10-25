package lv.rvt;

import java.util.*;

public class App 
{
  
  
  public static void main( String[] args ){
   
    Scanner scanner = new Scanner(System.in);
    printTriangle(4);
    
  }
  
  public static void printTriangle(int size) {
    for (int i = 1; i <= size; i++) {
        printSpaces(size - i); // Print spaces
        printStars(i);         // Print stars
        System.out.println();  // Move to the next line
    }
 }

 public static void printSpaces(int count) {
    for (int j = 0; j < count; j++) {
        System.out.print(" "); // Print a space
    }
 } 

 public static void printStars(int count) {
    for (int k = 0; k < count; k++) {
        System.out.print("*"); // Print a star
    }
  }

    
  

  
} 

