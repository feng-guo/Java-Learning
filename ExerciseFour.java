/*
 * [ExerciseFour.java]
 * 
 * Author: Feng Guo
 * Date: Sept 13/17
 */

import java.util.Scanner;
import java.lang.String;

public class ExerciseFour {
  public static void main(String[] args){
    exercise1();
    exercise2();
    exercise3();
    exercise4();
    exercise5();
    exercise6();
    exercise7();
    exercise8();
    exercise9();
    exercise10();
  }   
  
  //Exercise 4.1
  public static void exercise1(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your age");
    int number = input.nextInt();
    if (number > 65) {
    System.out.println("You are a senior citizen.");
    input.close();
    }
  }
  
  //Exericse 4.2
  public static void exercise2(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your mark");
    int mark = input.nextInt();
    if (mark >= 50) {
      System.out.println("You passed.");
    } else {
      System.out.println("Better luck next time");
    } input.close();
  }
    
    //Exercise 4.3
  public static void exercise3(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the temperature");
    int temperature = input.nextInt();
    if (temperature > 30) {
      System.out.println("hot");
    } else if (temperature >=20) {
      System.out.println("comfortable");
    } else if (temperature >=10) {
      System.out.println("cool");
    } else {
      System.out.println("cold");
    } input.close();
  }
    
    //Exercise 4.4
  public static void exercise4(){  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number from 1-10");
    int guess = input.nextInt();
    if (guess == 7) {
      System.out.println("You win!");
    } else {
      System.out.println("Game over");
    } input.close();
  }
    
    //Exercise 4.5
  public static void exercise5(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a mark");
    int markOne = input.nextInt();
    if (markOne >= 75 && markOne <= 100) {
      System.out.println("Great!");
    } else if (markOne >= 50 && markOne < 75) {
      System.out.println("pass");
    } else if (markOne >= 0 && markOne < 50) {
        System.out.println("Fail");
    } else {
      System.out.println("Invalid");
    } input.close();
  }
    
    //Exercise 4.6
  public static void exercise6() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your password");
    String password = input.next();
    if (password.equals("happy")) {
      System.out.println("You are logged in");
    } else {
      System.out.println("Incorrect password");
    } input.close();
  }
    
    //Exercise 4.7
  public static void exercise7() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int numberOne = input.nextInt();
    System.out.println("Enter another number");
    int numberTwo = input.nextInt();
    if (numberTwo > numberOne) {
      System.out.println(numberTwo + " is greater than " + numberOne);
    } else if (numberOne > numberTwo){
      System.out.println(numberOne + " is greater than " + numberTwo);
    } else {
      System.out.println(numberOne + " is equal to " + numberTwo);
    } input.close();
  }
    
    //Exercise 4.8
  public static void exercise8() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of times you want to print Hello");
    int numberHello = input.nextInt();
    for (int i = 0; i < numberHello; i++ ) {
      System.out.println("Hello");
    } input.close();
  }
    
    //Exercise 4.9
  public static void exercise9() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word");
    String wordOne = input.next();
    System.out.println("Enter another word");
    String wordTwo = input.next();
    System.out.println("Enter another word");
    String wordThree = input.next();
    
    if (wordTwo.compareTo(wordOne) >= 0 && wordThree.compareTo(wordOne) >= 0){
      if (wordThree.compareTo(wordTwo) > 0) {
        System.out.println(wordOne + " " + wordTwo + " " + wordThree);
      } else {
        System.out.println(wordOne + " " + wordThree + " " + wordTwo);
      }
    } else if (wordOne.compareTo(wordTwo) >= 0 && wordThree.compareTo(wordTwo) >= 0){
      if (wordThree.compareTo(wordOne) > 0) {
        System.out.println(wordTwo + " " + wordOne + " " + wordThree);
      } else {
        System.out.println(wordTwo + " " + wordThree + " " + wordOne);
      }
    } else {
      if (wordTwo.compareTo(wordOne) >= 0) {
        System.out.println(wordThree + " " + wordOne + " " + wordTwo);
      } else {
        System.out.println(wordThree + " " + wordTwo + " " + wordOne);
      }
    } input.close();
  }
    
    //Exercise 4.10
  public static void exercise10() {
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
    } input.close();
  }
} 
      
    
    