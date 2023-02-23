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
        System.out.println("Enter new type: ");
        String newType = in.nextLine();

        System.out.println("First name will be updated to " + newType + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new first name: ");
            newType = in.nextLine();
            System.out.println("First name will be updated to " + newType + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }
        this.type = newType;
        System.out.println("Type updated to " + this.type);
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
        this.description = newDescription;
        System.out.println("Description updated to " + this.description);
    }

    public void updateModelNumber(Scanner in) {
        System.out.println("Enter new model number: ");
        int newMD = in.nextInt();
        in.nextLine();

        System.out.println("Model number will be updated to " + newMD + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new model number: ");
            newMD = in.nextInt();
            in.nextLine();
            System.out.println("First name will be updated to " + newMD + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }
        this.modelNumber = newMD;
        System.out.println("Model number updated to " + this.modelNumber);
    }

    public void updateYear(Scanner in) {
        System.out.println("Enter new year: ");
        int newYear = in.nextInt();
        in.nextLine();

        System.out.println("Year will be updated to " + newYear + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new year: ");
            newYear = in.nextInt();
            in.nextLine();
            System.out.println("Year will be updated to " + newYear + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }
        this.year = newYear;
        System.out.println("Year updated to " + this.year);
    }

    public void updateSerialNumber(Scanner in) {
        System.out.println("Enter new serial number: ");
        int newSN = in.nextInt();
        in.nextLine();

        System.out.println("Serial number will be updated to " + newSN + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new serial number: ");
            newSN = in.nextInt();
            in.nextLine();
            System.out.println("Serial number will be updated to " + newSN + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }
        this.serialNumber = newSN;
        System.out.println("Serial number updated to " + this.serialNumber);
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
        this.arrivalDate = newArrival;
        System.out.println("Arrival date updated to " + this.arrivalDate);
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
        this.warrantyExpDate = newEXPDate;
        System.out.println("Expiration date updated to " + this.warrantyExpDate);
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
        this.manufacturer = newMan;
        System.out.println("Manufacturer updated to " + this.manufacturer);
    }

    public void updateWeight(Scanner in) {
        System.out.println("Enter new weight: ");
        double newWeight = in.nextDouble();
        in.nextLine();

        System.out.println("Weight will be updated to " + newWeight + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new weight: ");
            newWeight = in.nextDouble();
            in.nextLine();
            System.out.println("Weight will be updated to " + newWeight + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }
        this.weight = newWeight;
        System.out.println("Weight updated to " + this.weight);
    }

    public void updateSize(Scanner in) {
        System.out.println("Enter new size: ");
        double newSize = in.nextDouble();
        in.nextLine();

        System.out.println("Size will be updated to " + newSize + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while (userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new size: ");
            newSize = in.nextDouble();
            in.nextLine();
            System.out.println("Size will be updated to " + newSize + ". Is this correct? (y/n)");
            userInput = in.nextLine();
    }
        this.size = newSize;
        System.out.println("Size updated to " + this.size);
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
        this.manualName = newManualName;
        System.out.println("Manual name updated to " + this.manualName);
    }
}
