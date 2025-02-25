package lv.rvt;

import java.io.BufferedReader;
import java.util.*;


public class App  
{ 
  public static void main( String[] args ) throws Exception {
    Scanner scanner = new Scanner(System.in);
   
   printChese(8);
   

  }

  public static void printChese(int size){
    String black = "\033[40m  \033[0m";
    String green = "\033[42m  \033[0m";

    for (int i = 0; i < size; i++){
      for(int j = 0; j < size; j++){
        if ((i + j) % 2 == 0){
          System.out.print(black);
        }else {
          System.out.print(green);
        }
      }
      System.out.println();
    }

  }
  
 
}


