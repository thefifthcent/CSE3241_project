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
        System.out.println("Would you like to update a member, warehouse, or equipment?");
        userInput = in.nextLine();
        if (userInput.toLowerCase().equals("member")) {
          System.out.println("Enter member ID: ");
          int memberID = in.nextInt();
          in.nextLine();
          System.out.println("What would you like to update? (fName, lName, address, phoneNumber, email, startDate, endDate, or warehouseDistance)");
          userInput = in.nextLine();
          for (int i = 0; i < memberList.memberList.size(); i++) {
            if (memberList.memberList.get(i).userID == memberID) {
              if (userInput.toLowerCase().equals("fname")) {
                memberList.memberList.get(i).updateFName(in);
              } else if (userInput.toLowerCase().equals("lname")) {
                memberList.memberList.get(i).updateLName(in);
              } else if (userInput.toLowerCase().equals("address")) {
                memberList.memberList.get(i).updateAddress(in);
              } else if (userInput.toLowerCase().equals("phonenumber")) {
                memberList.memberList.get(i).updatePhoneNumber(in);
              } else if (userInput.toLowerCase().equals("email")) {
                memberList.memberList.get(i).updateEmail(in);
              } else if (userInput.toLowerCase().equals("startdate")) {
                memberList.memberList.get(i).updateStartDate(in);
              } else if (userInput.toLowerCase().equals("enddate")) {
                memberList.memberList.get(i).updateEndDate(in);
              } else if (userInput.toLowerCase().equals("warehousedistance")) {
                memberList.memberList.get(i).updateWarehouseDistance(in);
              } else {
                System.out.println("Not a valid input.");
              }
            }
          }
        } else if (userInput.toLowerCase().equals("warehouse")) {
          System.out.println("Enter warehouse address: ");
          String warehouseAddress = in.nextLine();
          System.out.println("What would you like to update? (city, address, phoneNumber, managerName, storageCapacity, or droneCapacity)");
          userInput = in.nextLine();
          for (int i = 0; i < warehouseList.warehouseList.size(); i++) {
            if (warehouseList.warehouseList.get(i).address == warehouseAddress) {
              if (userInput.toLowerCase().equals("city")) {
                warehouseList.warehouseList.get(i).updateCity(in);
              } else if (userInput.toLowerCase().equals("address")) {
                warehouseList.warehouseList.get(i).updateAddress(in);
              } else if (userInput.toLowerCase().equals("phonenumber")) {
                warehouseList.warehouseList.get(i).updatePhoneNumber(in);
              } else if (userInput.toLowerCase().equals("managername")) {
                warehouseList.warehouseList.get(i).updateManagerName(in);
              } else if (userInput.toLowerCase().equals("storagecapacity")) {
                warehouseList.warehouseList.get(i).updateStorageCapacity(in);
              } else if (userInput.toLowerCase().equals("dronecapacity")) {
                warehouseList.warehouseList.get(i).updateDroneCapacity(in);
              } else {
                System.out.println("Not a valid input.");
              }
            }
          }

        } else if (userInput.toLowerCase().equals("equipment")) {
          System.out.println("Enter inventory ID: ");
          int inventoryID = in.nextInt();
          in.nextLine();
          System.out.println("What would you like to update? (type, description, modelNumber, year, serialNumber, arrivalDate, warrantyExpDate, manufacturer, weight, size, or manualName)");
          userInput = in.nextLine();
          for (int i = 0; i < equipmentList.equipmentList.size(); i++) {
            if (equipmentList.equipmentList.get(i).inventoryID == inventoryID) {
              if (userInput.toLowerCase().equals("type")) {
                equipmentList.equipmentList.get(i).updateType(in);
              } else if (userInput.toLowerCase().equals("description")) {
                equipmentList.equipmentList.get(i).updateDescription(in);
              } else if (userInput.toLowerCase().equals("modelnumber")) {
                equipmentList.equipmentList.get(i).updateModelNumber(in);
              } else if (userInput.toLowerCase().equals("year")) {
                equipmentList.equipmentList.get(i).updateYear(in);
              } else if (userInput.toLowerCase().equals("serialnumber")) {
                equipmentList.equipmentList.get(i).updateSerialNumber(in);
              } else if (userInput.toLowerCase().equals("arrivaldate")) {
                equipmentList.equipmentList.get(i).updateArrivalDate(in);
              } else if (userInput.toLowerCase().equals("warrantyexpdate")) {
                equipmentList.equipmentList.get(i).updateWarrantyExpDate(in);
              } else if (userInput.toLowerCase().equals("manufacturer")) {
                equipmentList.equipmentList.get(i).updateManufacturer(in);
              } else if (userInput.toLowerCase().equals("weight")) {
                equipmentList.equipmentList.get(i).updateWeight(in);
              } else if (userInput.toLowerCase().equals("size")) {
                equipmentList.equipmentList.get(i).updateSize(in);
              } else if (userInput.toLowerCase().equals("manualname")) {
                equipmentList.equipmentList.get(i).updateManualName(in);
              } else {
                System.out.println("Not a valid input.");
              }
            }
          }
        } else if (userInput.toLowerCase().equals("equipment")) {
        } else {
          System.out.println("Not a valid input.");
        }
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
        continue;
      }

      System.out.println("Would you like to add, update, delete, or search a record? Type \"exit\" to exit the program.");
      userInput = in.nextLine();
    }
  in.close();  
  }
}