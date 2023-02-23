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
    MemberList memberList = new MemberList();
    EquipmentList equipmentList = new EquipmentList();
    WarehouseList warehouseList = new WarehouseList();

    System.out.println("Welcome!\n");

    System.out.println("Would you like to add, update, delete, or search a record? Type \"exit\" to exit the program.");
    String userInput = in.nextLine();

    while(!userInput.toLowerCase().equals("exit")) {
      if(userInput.toLowerCase().equals("add")) {
        System.out.println("Would you like to add a member, warehouse, or equipment?");
        userInput = in.nextLine();
        if (userInput.toLowerCase().equals("member")) {
          memberList.addMember(in);
        } else if (userInput.toLowerCase().equals("warehouse")) {
          warehouseList.addWarehouse(in);
        } else if (userInput.toLowerCase().equals("equipment")) {
          equipmentList.addEquipment(in);
        } else {
          System.out.println("Not a valid input.");
        }
      } else if(userInput.toLowerCase().equals("update")) {

      } else if(userInput.toLowerCase().equals("delete")) {
        System.out.println("Would you like to delete a member, warehouse, or equipment?");
        userInput = in.nextLine();
        if (userInput.toLowerCase().equals("member")) {
          memberList.deleteMember(in);
        } else if (userInput.toLowerCase().equals("warehouse")) {
          warehouseList.deleteWarehouse(in);
        } else if (userInput.toLowerCase().equals("equipment")) {
          equipmentList.deleteEquipment(in);
        } else {
          System.out.println("Not a valid input.");
        }
      } else if(userInput.toLowerCase().equals("search")) {
        System.out.println("Would you like to search for a member, warehouse, or equipment?");
        userInput = in.nextLine();
        if (userInput.toLowerCase().equals("member")) {
          memberList.searchMember(in);
        } else if (userInput.toLowerCase().equals("warehouse")) {
          warehouseList.searchWarehouse(in);
        } else if (userInput.toLowerCase().equals("equipment")) {
          equipmentList.searchEquipment(in);
        } else {
          System.out.println("Not a valid input.");
        }
      } else {
        System.out.println("Not a valid input. Type \"add\", \"update\", \"delete\", \"search\", or \"exit\".");
        userInput = in.nextLine();
      }

      System.out.println("Would you like to add, update, delete, or search a record? Type \"exit\" to exit the program.");
      userInput = in.nextLine();
    }
  in.close();  
  }
}