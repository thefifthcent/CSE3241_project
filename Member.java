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
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new first name: ");
            newFName = in.nextLine();
            System.out.println("First name will be updated to " + newFName + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }

        this.fName = newFName;
        System.out.println("First name updated to " + this.fName);
    }

    public void updateLName(Scanner in) {
        // TODO
    }

    public void updateAddress(Scanner in) {
        // TODO
    }

    public void updatePhoneNumber(Scanner in) {
        // TODO
    }

    public void updateEmail(Scanner in) {
        // TODO
    }

    public void updateStartDate(Scanner in) {
        // TODO
    }

    public void updateEndDate(Scanner in) {
        // TODO
    }

    public void updateWarehouseDistance(Scanner in) {
        // TODO
    }

    public void updateUserID(Scanner in) {
        // TODO
    }
    
}
