import java.util.Scanner;
public class AddressBookMain {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        /**
         * from addressBook class calling addcontact method to edit the contacts
         */
        addressBook.addContact();
        System.out.println("Enter Y To Edit The Contact");
        String choice = scanner.nextLine();
        if (choice.equals("y") || choice.equals("Y")) {
            addressBook.editContact();
        }

    }
}
