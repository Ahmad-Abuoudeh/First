import java.util.ArrayList;

public class AddressBook {

    ArrayList<Object> str = new ArrayList<>();

    public void AddBuddy(String name, String address) {
        BuddyInfo bud = new BuddyInfo();
        BuddyInfo.name = name;
        bud.address = address;
        str.add(bud);
    }

    public void RemoveBuddy(String name) {
        str.remove(name);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}


