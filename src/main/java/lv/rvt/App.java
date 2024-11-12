package lv.rvt;

import java.util.*;

public class App  
{ 
   public static void main( String[] args ){
    Scanner scanner = new Scanner(System.in);
    counter counter = new counter(2);
    counter counter2 = new counter(100);

    counter.printValue();

    counter.decrement();
    counter.printValue();

    counter.decrement();
    counter.printValue();

    counter.decrement();
    counter.printValue();
    System.out.println();

    counter2.printValue();

    counter2.reset();
    counter2.printValue();

    counter2.decrement();
    counter2.printValue();
  }
  
} 

