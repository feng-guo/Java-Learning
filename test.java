import java.util.Scanner;
  
public class test {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Reply with Yes or No");
    System.out.println("Do you have $200,000 to $500,000?");
    String response = input.next();
    if (response.equals("Yes") || response.equals("yes") || response.toUpperCase().equals("YES")) {
      System.out.println("Do you get to places quickly?");
      response = input.next();
      if (response.toUpperCase().equals("YES")) {
        System.out.println("Purchase a Lamborghini Aventador");
      } else {
        System.out.println("Purchase a Rolls-Royce Phantom");
      }
    } else {
      System.out.println("Do you have $100,000 to $200,000?");
      response = input.next();
      if (response.toUpperCase().equals("YES")) {
        System.out.println("Do you like imports?");
        response = input.next();
        if (response.toUpperCase().equals("YES")) {
          System.out.println("Purchase a Nissan GTR");
        } else {
          System.out.println("Purchase a Dodge Viper SRT");
        }
      } else {
        System.out.println("Purchase a Honda Fit");
      }
    }
  }
}