package lv.rvt;

import java.util.*;

public class App  
{ 
  public static void main( String[] args ){
   Scanner scanner = new Scanner(System.in);
    
    
   paymentcard paulsCard = new paymentcard(20);
   paymentcard mattsCard = new paymentcard(30);

        
    paulsCard.eatHeartily();
       
    mattsCard.eatAffordably();

        
    System.out.println("Paul: " + paulsCard);
    System.out.println("Matt: " + mattsCard);

       
    paulsCard.addMoney(20);
    mattsCard.eatHeartily();

        
    System.out.println("Paul: " + paulsCard);
    System.out.println("Matt: " + mattsCard);

        
    paulsCard.eatAffordably();
    paulsCard.eatAffordably();
        
    mattsCard.addMoney(50);

        
    System.out.println("Paul: " + paulsCard);
    System.out.println("Matt: " + mattsCard);
    


  }
  
} 

