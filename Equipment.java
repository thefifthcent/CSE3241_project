import java.util.Scanner;

public class Equipment {
    //  Attributes
    String type;
    String description;
    int modelNumber;
    int year;
    int serialNumber;
    int inventoryID;
    String arrivalDate;
    String warrantyExpDate;
    String manufacturer;
    double weight;
    double size;
    String manualName;

    // Constructor
    public Equipment() {
        type = "";
        description = "";
        modelNumber = 0;
        year = 0;
        serialNumber = 0;
        inventoryID = mainFile.currentInventoryID++;
        arrivalDate = "";
        warrantyExpDate = "";
        manufacturer = "";
        weight = 0.0;
        size = 0.0;
        manualName = "";
    }

    public void updateType(Scanner in) {
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

    public void updateDescription(Scanner in) {
        System.out.println("Enter new description: ");
        String newDescription = in.nextLine();

        System.out.println("Description will be updated to " + newDescription + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new description: ");
            newDescription = in.nextLine();
            System.out.println("Description will be updated to " + newDescription + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }
    }

    public void updateModelNumber(Scanner in) {
        System.out.println("Enter new model number: ");
        String newMD = in.nextLine();

        System.out.println("Model number will be updated to " + newMD + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new model number: ");
            newMD = in.nextLine();
            System.out.println("First name will be updated to " + newMD + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }
    }

    public void updateYear(Scanner in) {
        System.out.println("Enter new year: ");
        int newYear = in.nextInt();

        System.out.println("Year will be updated to " + newYear + ". Is this correct? (y/n)");
        int userInput = in.nextInt();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new year: ");
            newYear = in.nextInt();
            System.out.println("Year will be updated to " + newYear + ". Is this correct? (y/n)");
            userInput = in.nextInt();
    }
    }

    public void updateSerialNumber(Scanner in) {
        System.out.println("Enter new serial number: ");
        String newSN = in.nextLine();

        System.out.println("Serial number will be updated to " + newSN + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new serial number: ");
            newSN = in.nextLine();
            System.out.println("Serial number will be updated to " + newSN + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }
    }

    public void updateInventoryID(Scanner in) {
        System.out.println("Enter new inventory ID: ");
        String newInvID = in.nextLine();

        System.out.println("Inventory ID will be updated to " + newInvID + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new inventory ID: ");
            newInvID = in.nextLine();
            System.out.println("Inventory ID will be updated to " + newInvID + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }
    }

    public void updateArrivalDate(Scanner in) {
        System.out.println("Enter new arrival date: ");
        String newArrival = in.nextLine();

        System.out.println("Arrival date will be updated to " + newArrival + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new arrival date: ");
            newArrival = in.nextLine();
            System.out.println("Arrival date will be updated to " + newArrival + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }
    }

    public void updateWarrantyExpDate(Scanner in) {
        System.out.println("Enter new warranty expiration date: ");
        String newEXPDate = in.nextLine();

        System.out.println("Warranty expiration date will be updated to " + newEXPDate + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new warranty expiration date: ");
            newEXPDate = in.nextLine();
            System.out.println("Warranty expiration date will be updated to " + newEXPDate + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }
    }

    public void updateManufacturer(Scanner in) {
        System.out.println("Enter new manufacturer: ");
        String newMan = in.nextLine();

        System.out.println("Manufacturer will be updated to " + newMan + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new warranty expiration date: ");
            newMan = in.nextLine();
            System.out.println("Manufacturer will be updated to " + newMan + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }
    }

    public void updateWeight(Scanner in) {
        System.out.println("Enter new weight: ");
        int newWeight = in.nextInt();

        System.out.println("Weight will be updated to " + newWeight + ". Is this correct? (y/n)");
        int userInput = in.nextInt();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new weight: ");
            newWeight = in.nextInt();
            System.out.println("Weight will be updated to " + newWeight + ". Is this correct? (y/n)");
            userInput = in.nextInt();
    }
    }

    public void updateSize(Scanner in) {
        System.out.println("Enter new size: ");
        int newSize = in.nextInt();

        System.out.println("Size will be updated to " + newSize + ". Is this correct? (y/n)");
        int userInput = in.nextInt();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new size: ");
            newSize = in.nextInt();
            System.out.println("Size will be updated to " + newSize + ". Is this correct? (y/n)");
            userInput = in.nextInt();
    }
    }

    public void updateManualName(Scanner in) {
        System.out.println("Enter new manual name: ");
        String newManualName = in.nextLine();

        System.out.println("Manual Name will be updated to " + newManualName + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new manual name: ");
            newManualName = in.nextLine();
            System.out.println("Manual name will be updated to " + newManualName + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }
    }
}
