import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
public class AddressBookMain {
    /**
     * create method choose() to select any of the option
     */
    public void choose() {
        MultipleAddressBook obj1 = new MultipleAddressBook();
        AddressBook obj2 = new AddressBook();
        while (true) {
            System.out.println(
                    "Enter \n 1. To add The new AddressBook\n 2. To do AddressBook functions\n 3. To delete the AddressBook\n "
                            + "4. To Print the AddressBook\n 5. To Print the contacts in AddressBook\n 6. To book options\n 0. to exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    obj1.addAddressBook();
                    break;
                case 2:
                    obj1.addressBookFunctions();
                    break;
                case 3:
                    obj1.deleteBook();
                    break;
                case 4:
                    obj1.printBook();
                    break;
                case 5:
                    obj1.printContactsInBook();
                    break;
                case 6:
                    obj2.viewByOptions();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the wrong input");
            }
        }
    }

    /**
     * Main method for manipulation AddressBookCollection
     *
     * @param args - Default Java param (Not used)
     */
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        Scanner Scan = new Scanner(System.in);

        /**
         * try and catch block will be uses to handle exception
         */
        try {
            InputStream inputStream = new FileInputStream(
                    "C:\\Users\\document\\eclipse-workspace\\addressbook-system-io\\src\\com\\bridgelabz\\addressbook");
            int byteData = inputStream.read();
            if (byteData != -1) {
                System.out.println(byteData);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }

        /**
         * try and catch block will be uses to handle exception if file is created then
         * it will check it is exist or not if exist then display file successfully
         * created otherwise catch exception
         */
        File file = new File(
                "C:\\Users\\Nagu\\eclipse-workspace\\addressbook-system-io\\src\\com\\bridgelabz\\addressbook");
        try {
            boolean isFileCreated = file.createNewFile();
            if (isFileCreated) {
                System.out.println("File Created successfully!!1");
            } else {
                System.out.println("Something went wrong or file already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        AddressBookMain addressBookMain = new AddressBookMain();

        /**
         * calling choose() method
         */
        addressBookMain.choose();
    }
}


