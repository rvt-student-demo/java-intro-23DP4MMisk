package lv.rvt;

import java.util.*;

public class App 
{
  public static void main( String[] args )
  {
    // Kods

    // Ctrl + /
   // System.out.println("Hello world");
   // FACTORIAL
   // System.out.print("Give a number: " );
   //int num = Integer.valueOf(scanner.nextLine());
    //int factorial = 1;
    //for (int i = 1; i <= num; i++){
    //  factorial *= i;
    //}
    //System.out.println("Factorial: " + factorial);
    // uzd from where to where (2 parts) - 2 variants
    //int sk = num2;
    // while(sk <= num){
      //System.out.println(sk);
      //sk++;
    //}
    //while(sk >= num){
      //break;
    //}
   
   
    Scanner scanner = new Scanner(System.in);
   

    System.out.print("Where to?");
    int num = Integer.valueOf(scanner.nextLine());
   
    System.out.print("Where from?");
    int num2 = Integer.valueOf(scanner.nextLine());
    
    for(int sk = num2; sk <= num; sk++) {
      System.out.println(sk);
    }

    for(int sk2 = num2; sk2 >= num;) {
      break;
    }
    
    
   
   

  }

  

}  

