package lv.rvt;

import java.util.*;

public class App  
{ 
   public static void main( String[] args ){
    Scanner scanner = new Scanner(System.in);
    
    
    paymentcard card = new paymentcard(50);
    System.out.println(card);
    

    card.eatAffordably();
    System.out.println(card);

    card.eatHeartily();
    card.eatAffordably();
    System.out.println(card);

    //card.eatHeartily();
    //System.out.println(card);

    //card.eatHeartily();
   // System.out.println(card);



  }
  
} 

