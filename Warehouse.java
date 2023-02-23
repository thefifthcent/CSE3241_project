import java.util.Scanner;

public class Warehouse {
    //  Attributes
    String city;
    String address;
    String phoneNumber;
    String managerName;
    int storageCapacity;
    int droneCapacity;

    // Constructor
    public Warehouse() {
        city = "";
        address = "";
        phoneNumber = "";
        managerName = "";
        storageCapacity = 0;
        droneCapacity = 0;
    }

    public void updateCity(Scanner in) {
        // TODO
        System.out.println("Enter new city: ");
        String newCity = in.nextLine();

        System.out.println("City will be updated to " + newCity + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while(userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new city: ");
            newCity = in.nextLine();
            System.out.println("City will be updated to " + newCity + ". Is this correct? (y/n)");
            userInput = in.nextLine();
        }

        this.city = newCity;
        System.out.println("City updated to " + this.city);
    }

    public void updateAddress(Scanner in) {
        // TODO
        System.out.println("Enter new address: ");
        String newAddress = in.nextLine();

        System.out.println("Address will be updated to " + newAddress + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while(userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new address: ");
            newAddress = in.nextLine();
            System.out.println("First name will be updated to " + newAddress + ". Is this correct? (y/n)");
            userInput = in.nextLine();
        }

        this.address = newAddress;
        System.out.println("Address updated to " + this.address);
    }

    public void updatePhoneNumber(Scanner in) {
        // TODO
        System.out.println("Enter new phone number: ");
        String newPhone = in.nextLine();

        System.out.println("Phone number will be updated to " + newPhone + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while(userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new phone number: ");
            newPhone = in.nextLine();
            System.out.println("Phone number will be updated to " + newPhone + ". Is this correct? (y/n)");
            userInput = in.nextLine();
        }

        this.phoneNumber = newPhone;
        System.out.println("Phone number updated to " + this.phoneNumber);
    }

    public void updateManagerName(Scanner in) {
        // TODO
        System.out.println("Enter new manager name: ");
        String newManager = in.nextLine();

        System.out.println("Manager name will be updated to " + newManager + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while(userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new manager name: ");
            newManager = in.nextLine();
            System.out.println("Manager name will be updated to " + newManager + ". Is this correct? (y/n)");
            userInput = in.nextLine();
        }

        this.managerName = newManager;
        System.out.println("Manager name updated to " + this.managerName);
    }

    public void updateStorageCapacity(Scanner in) {
        // TODO
        System.out.println("Enter new storage capacity : ");
        int newStorageCapacity = in.nextInt();

        System.out.println("Storage capacity will be updated to " + newStorageCapacity + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while(userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new storage capacity : ");
            newStorageCapacity = in.nextInt();
            System.out.println("Storage capacity  will be updated to " + newStorageCapacity + ". Is this correct? (y/n)");
            userInput = in.nextLine();
        }

        this.storageCapacity = newStorageCapacity;
        System.out.println("Storage capacity updated to " + this.storageCapacity);
    }

    public void updateDroneCapacity(Scanner in) {
        // TODO
        System.out.println("Enter new drone capacity: ");
        int newDroneCapacity = in.nextInt();

        System.out.println("Drone capacity will be updated to " + newDroneCapacity + ". Is this correct? (y/n)");
        String userInput = in.nextLine();
        while(userInput.toLowerCase().equals("n")) {
            System.out.println("Enter new drone capacity: ");
            newDroneCapacity = in.nextInt();
            System.out.println("Drone capacity  will be updated to " + newDroneCapacity + ". Is this correct? (y/n)");
            userInput = in.nextLine();
        }

        this.droneCapacity = newDroneCapacity;
        System.out.println("Drone capacity updated to " + this.droneCapacity);
    }
}
