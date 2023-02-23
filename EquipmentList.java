import java.util.ArrayList;
import java.util.Scanner;

public class EquipmentList {
    // Attributes
    ArrayList<Equipment> equipmentList;

    // Constructor
    public EquipmentList() {
        equipmentList = new ArrayList<Equipment>();
    }

    public void addEquipment(Scanner in) {
        Equipment newEquipment = new Equipment();
        newEquipment.updateType(in);
        newEquipment.updateDescription(in);
        newEquipment.updateModelNumber(in);
        newEquipment.updateYear(in);
        newEquipment.updateSerialNumber(in);
        newEquipment.updateArrivalDate(in);
        newEquipment.updateWarrantyExpDate(in);
        newEquipment.updateManufacturer(in);
        newEquipment.updateWeight(in);
        newEquipment.updateSize(in);
        newEquipment.updateManualName(in);
        equipmentList.add(newEquipment);
    }

    public void deleteEquipment(Scanner in) {
        System.out.println("Enter the inventory ID of the equipment you would like to remove: ");
        int inventoryID = in.nextInt();
        in.nextLine();
        for (int i = 0; i < equipmentList.size(); i++) {
            if (equipmentList.get(i).inventoryID == inventoryID) {
                equipmentList.remove(i);
                System.out.println("Equipment removed.");
                return;
            }
        }
        System.out.println("Equipment not found.");
    }

    public void searchEquipment(Scanner in) {
        System.out.println("Enter the inventory ID of the equipment you would like to search for: ");
        int inventoryID = in.nextInt();
        in.nextLine();
        for (int i = 0; i < equipmentList.size(); i++) {
            if (equipmentList.get(i).inventoryID == inventoryID) {
                System.out.println("Equipment found.");
                System.out.println("Type: " + equipmentList.get(i).type);
                System.out.println("Description: " + equipmentList.get(i).description);
                System.out.println("Model number: " + equipmentList.get(i).modelNumber);
                System.out.println("Year: " + equipmentList.get(i).year);
                System.out.println("Serial number: " + equipmentList.get(i).serialNumber);
                System.out.println("Arrival date: " + equipmentList.get(i).arrivalDate);
                System.out.println("Warranty expiration date: " + equipmentList.get(i).warrantyExpDate);
                System.out.println("Manufacturer: " + equipmentList.get(i).manufacturer);
                System.out.println("Weight: " + equipmentList.get(i).weight);
                System.out.println("Size: " + equipmentList.get(i).size);
                System.out.println("Manual name: " + equipmentList.get(i).manualName);
                System.out.println("Inventory ID: " + equipmentList.get(i).inventoryID);
                return;
            }
        }
        System.out.println("Equipment not found.");
    }
}
