package lv.rvt;

import java.io.BufferedReader;
import java.util.*;


public class App  
{ 
  public static void main( String[] args ) throws Exception {
    Scanner scanner = new Scanner(System.in);
    BufferedReader reader = Helper.getReader("Person.csv");

   System.out.println(reader.readLine());
   System.out.println(reader.readLine());
   System.out.println(reader.readLine());

  
  }
}

