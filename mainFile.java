/**
 * Database Project
 * 
 * @Authors: Jessie, Yuhao. Alaina, Nikhil
 */

import java.util.Scanner;

public class mainFile {
  static int currentUserID = 0;
  static int currentInventoryID = 0;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); // Scanner object

    System.out.println("Welcome!\n");

    System.out.println("Would you like to add, edit/delete or search a record?");
    String userInput = in.nextLine();

    while(true) {
      if(userInput.toLowerCase().equals("add")) {

      } else if(userInput.toLowerCase().equals("edit/delete")) {

      } else if(userInput.toLowerCase().equals("search")) {

      } else {
        System.out.println("Not a valid input. Type \"add\", \"edit/delete\" or \"search\"");
        userInput = in.nextLine();
      }
    }      
  }  
}