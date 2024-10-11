package lv.rvt;

import java.util.*;

public class App 
{
  public static void main( String[] args )
  {
    // Kods

    // Ctrl + /
   // System.out.println("Hello world");
    Scanner scanner = new Scanner(System.in);
   // System.out.print("Give a number: " );
    
    //int num = Integer.valueOf(scanner.nextLine());
    //int factorial = 1;
    //for (int i = 1; i <= num; i++){
    //  factorial *= i;
    //}
    
    //System.out.println("Factorial: " + factorial);

    System.out.println("Give a number");
    int sum = 0;
    int sk = 0;
    double average = 0;
    int even = 0;
    int odd = 0;


    while(true) {
      
      int num = Integer.valueOf(scanner.nextLine());
      


      if(num == -1){
       break;
         
      }

      if(sk % 2 != 0){
        odd = odd + 1;
      }
      
      if (sk % 2 == 0){
        even = even + 1;
      }
     
      sum += num;
      sk = sk + 1;
      average = sum / sk;
     
     
    }

    System.out.println("Thx!Bye!");
    System.out.println("Sum:" + sum);
    System.out.println("Numbers: " + sk);
    System.out.println("Average: " + average);
    System.out.println("Even: " + even);
    System.out.println("Odd:" + odd);

  }

      

}  

