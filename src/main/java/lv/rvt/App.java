package lv.rvt;

import java.util.*;

public class App  
{ 
  public static void main( String[] args ){
    Scanner scanner = new Scanner(System.in);
    
    
    
    
    
    Timer timer = new Timer();

    while (true) {
        System.out.println(timer);
        timer.advance();
    
        try {
            Thread.sleep(10);
        } catch (Exception e) {
           System.out.println("Error" + e.getMessage());
        }
    }
    

    

  }
  
} 

