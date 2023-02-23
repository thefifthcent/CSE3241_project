import java.util.ArrayList;
import java.util.Scanner;

public class MemberList {
    // Attributes
    ArrayList<Member> memberList;

    // Constructor
    public MemberList() {
        memberList = new ArrayList<Member>();
    }

    public void addMember(Scanner in) {
        Member newMember = new Member();
        newMember.updateFName(in);
        newMember.updateLName(in);
        newMember.updateAddress(in);
        newMember.updatePhoneNumber(in);
        newMember.updateEmail(in);
        newMember.updateStartDate(in);
        newMember.updateEndDate(in);
        newMember.updateWarehouseDistance(in);
        this.memberList.add(newMember);
    }

    public void deleteMember(Scanner in) {
        System.out.println("Enter the user ID of the member you would like to remove: ");
        int userID = in.nextInt();
        in.nextLine();
        for (int i = 0; i < this.memberList.size(); i++) {
            if (this.memberList.get(i).userID == userID) {
                this.memberList.remove(i);
                System.out.println("Member removed.");
                return;
            }
        }
        System.out.println("Member not found.");
    }

    public void searchMember(Scanner in) {
        System.out.println("Enter the user ID of the member you would like to search for: ");
        int userID = in.nextInt();
        in.nextLine();
        for (int i = 0; i < this.memberList.size(); i++) {
            if (this.memberList.get(i).userID == userID) {
                System.out.println("Member found.");
                System.out.println("First name: " + this.memberList.get(i).fName);
                System.out.println("Last name: " + this.memberList.get(i).lName);
                System.out.println("Address: " + this.memberList.get(i).address);
                System.out.println("Phone number: " + this.memberList.get(i).phoneNumber);
                System.out.println("Email: " + this.memberList.get(i).email);
                System.out.println("Start date: " + this.memberList.get(i).startDate);
                System.out.println("End date: " + this.memberList.get(i).endDate);
                System.out.println("Warehouse distance: " + this.memberList.get(i).warehouseDistance);
                System.out.println("User ID: " + this.memberList.get(i).userID);
                return;
            }
        }
        System.out.println("Member not found.");
    }
}
