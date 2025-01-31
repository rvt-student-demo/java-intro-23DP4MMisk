package lv.rvt;

import java.io.BufferedReader;
import java.util.*;


public class App  
{ 
  public static void main( String[] args ) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    
   
    
    Student ollies = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
    System.out.println(ollies);
    ollies.study();
    System.out.println(ollies);
    System.out.println();
    Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
    Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
    System.out.println(ada);
    System.out.println(esko);

    Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

    int i = 0;
    while (i < 25) {
      ollie.study();
      i = i + 1;
    }
    System.out.println(ollie);

    ArrayList<Personn> persons = new ArrayList<Personn>();
    persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
    persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

    printPersons(persons);

  }

  public static void printPersons(ArrayList<Personn> persons) {
    for (Personn person : persons) {
        person.printDetails();
    }
}


  
}

