package lv.rvt;

import java.io.BufferedReader;
import java.util.*;


public class App  
{ 
  public static void main( String[] args ) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    Box box = new  Box( 2.5, 5.0, 6.0 ) ;

    System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );
    System.out.println( "topArea: "  + box.topArea() );
  
  }
}

