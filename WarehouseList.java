import java.util.ArrayList;
import java.util.Scanner;

public class WarehouseList {
    //Attributes
    ArrayList<Warehouse> warehouseList;

    public WarehouseList() {
        warehouseList = new ArrayList<Warehouse>();
    }

    public void addWarehouse(Scanner in){
        Warehouse newWarehouse = new Warehouse();
        newWarehouse.updateCity(in);
        newWarehouse.updateAddress(in);
        newWarehouse.updatePhoneNumber(in);
        newWarehouse.updateManagerName(in);
        newWarehouse.updateStorageCapacity(in);
        newWarehouse.updateDroneCapacity(in);
    }

    public void deleteWarehouse(Scanner in) {
        System.out.println("Enter the address of the warehouse you would like to remove: ");
        String warehouseAddress = in.nextLine();
        in.nextLine();

        for(int idx = 0; idx < this.warehouseList.size(); idx++) {
            if(this.warehouseList.get(idx).address == warehouseAddress) {
                this.warehouseList.remove(idx);
                System.out.println("Warehouse found.");
                return;
            }
        }
        System.out.println("Warehouse not found");
    }

    public void searchWarehouse(Scanner in){
        System.out.println("Enter the address of the warehouse you would like to search for: ");
        String warehouseAddress = in.nextLine();
        in.nextLine();
        for (int i = 0; i < this.warehouseList.size(); i++) {
            if (this.warehouseList.get(i).address == warehouseAddress) {
                System.out.println("Warehouse found!");
                System.out.println("City: " + this.warehouseList.get(i).city);
                System.out.println("Address: " + this.warehouseList.get(i).address);
                System.out.println("Phone number: " + this.warehouseList.get(i).phoneNumber);
                System.out.println("Storage capacity: " + this.warehouseList.get(i).storageCapacity);
                System.out.println("Drone capactiy: " + this.warehouseList.get(i).droneCapacity);
                return;
            }
        }
        System.out.println("Warehouse not found.");
    }
}
