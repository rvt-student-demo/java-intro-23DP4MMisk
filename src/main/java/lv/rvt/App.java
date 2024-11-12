package lv.rvt;

import java.util.*;

public class App  
{ 
   public static void main( String[] args ){
    Scanner scanner = new Scanner(System.in);
    counter counter = new counter(10);
    counter.printValue();

    counter.decrement();
    counter.printValue();

    counter.decrement();
    counter.printValue();
    
    
  }

  
 
  
} 

