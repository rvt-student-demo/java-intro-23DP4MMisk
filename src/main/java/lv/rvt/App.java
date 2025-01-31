package lv.rvt;

import java.io.BufferedReader;
import java.util.*;


public class App  
{ 
  public static void main( String[] args ) throws Exception {
    Scanner scanner = new Scanner(System.in);
    ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
    juice.addToWarehouse(1000.0);
    juice.takeFromWarehouse(11.3);
    System.out.println(juice.getName()); 
    System.out.println(juice);   
    
   

  }


  
}

