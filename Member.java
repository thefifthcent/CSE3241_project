import java.util.Scanner;

public class Member {
    
    // Attributes
    String fName;
    String lName;
    String address;
    String phoneNumber;
    String email;
    String startDate;
    String endDate;
    double warehouseDistance;
    int userID;
    
    // Constructor
    public Member() {
        fName = "";
        lName = "";
        address = "";
        phoneNumber = "";
        email = "";
        startDate = "";
        endDate = "";
        warehouseDistance = 0.0;
        userID = mainFile.currentUserID++;
    }

    public void updateFName(Scanner in) {

        System.out.println("Enter new first name: ");
        String newFName = in.nextLine();

        System.out.println("First name will be updated to " + newFName + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (!userInput.toLowerCase().equals("y")) {
            System.out.println("Enter new first name: ");
            newFName = in.nextLine();
            System.out.println("First name will be updated to " + newFName + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }

        this.fName = newFName;
        System.out.println("First name updated to " + this.fName);
    }

    public void updateLName(Scanner in) {
        System.out.println("Enter new last name: ");
        String newLName = in.nextLine();

        System.out.println("Last name will be updated to " + newLName + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (!userInput.toLowerCase().equals("y")) {
            System.out.println("Enter new last name: ");
            newLName = in.nextLine();
            System.out.println("Last name will be updated to " + newLName + ". Is this correct? (y/n)");
            userInput = in.nextLine();
        }

        this.lName = newLName;
        System.out.println("Last name updated to " + this.lName);
    }

    public void updateAddress(Scanner in) {
        System.out.println("Enter new address: ");
        String newAddress = in.nextLine();

        System.out.println("Address will be updated to " + newAddress + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (!userInput.toLowerCase().equals("y")) {
            System.out.println("Enter new address: ");
            newAddress = in.nextLine();
            System.out.println("Address will be updated to " + newAddress + ". Is this correct? (y/n)");
            userInput = in.nextLine();
        }

        this.address = newAddress;
        System.out.println("Address updated to " + this.address);
    }

    public void updatePhoneNumber(Scanner in) {
        System.out.println("Enter new phone number: ");
        String newPhoneNumber = in.nextLine();

        System.out.println("Phone number will be updated to " + newPhoneNumber + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (!userInput.toLowerCase().equals("y")) {
            System.out.println("Enter new phone number: ");
            newPhoneNumber = in.nextLine();
            System.out.println("Phone number will be updated to " + newPhoneNumber + ". Is this correct? (y/n)");
            userInput = in.nextLine();
        }

        this.phoneNumber = newPhoneNumber;
        System.out.println("Phone number updated to " + this.phoneNumber);
    }

    public void updateEmail(Scanner in) {
        System.out.println("Enter new email: ");
        String newEmail = in.nextLine();

        System.out.println("Email will be updated to " + newEmail + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (!userInput.toLowerCase().equals("y")) {
            System.out.println("Enter new email: ");
            newEmail = in.nextLine();
            System.out.println("Email will be updated to " + newEmail + ". Is this correct? (y/n)");
            userInput = in.nextLine();
        }

        this.email = newEmail;
        System.out.println("Email updated to " + this.email);
    }

    public void updateStartDate(Scanner in) {
        System.out.println("Enter new start date: ");
        String newStartDate = in.nextLine();

        System.out.println("Start date will be updated to " + newStartDate + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (!userInput.toLowerCase().equals("y")) {
            System.out.println("Enter new start date: ");
            newStartDate = in.nextLine();
            System.out.println("Start date will be updated to " + newStartDate + ". Is this correct? (y/n)");
            userInput = in.nextLine();
        }

        this.startDate = newStartDate;
        System.out.println("Start date updated to " + this.startDate);
    }

    public void updateEndDate(Scanner in) {
        System.out.println("Enter new end date: ");
        String newEndDate = in.nextLine();

        System.out.println("End date will be updated to " + newEndDate + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (!userInput.toLowerCase().equals("y")) {
            System.out.println("Enter new end date: ");
            newEndDate = in.nextLine();
            System.out.println("End date will be updated to " + newEndDate + ". Is this correct? (y/n)");
            userInput = in.nextLine();
        }

        this.endDate = newEndDate;
        System.out.println("End date updated to " + this.endDate);
    }

    public void updateWarehouseDistance(Scanner in) {
        System.out.println("Enter new warehouse distance: ");
        double newWarehouseDistance = in.nextDouble();
        in.nextLine();

        System.out.println("Warehouse distance will be updated to " + newWarehouseDistance + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (!userInput.toLowerCase().equals("y")) {
            System.out.println("Enter new warehouse distance: ");
            newWarehouseDistance = in.nextDouble();
            System.out.println("Warehouse distance will be updated to " + newWarehouseDistance + ". Is this correct? (y/n)");
            userInput = in.nextLine();
        }

        this.warehouseDistance = newWarehouseDistance;
        System.out.println("Warehouse distance updated to " + this.warehouseDistance);
    }
    
}
