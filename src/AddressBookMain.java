import java.util.Scanner;
public class AddressBookMain {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        addressBook.addContact();
        System.out.println("Enter 1 To Edit The Contact and 2 To Delete The Contact ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            addressBook.editContact();
        } else {
            addressBook.deleteContact();
        }

    }

}
