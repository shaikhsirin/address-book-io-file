public class AddressBook {
    private class Contact {
        String firstName, lastNmae, address, city, state, emailId;
        int zipCode;
        long mobileNumber;
    }

    /**
     * created method printContact for creating contacts in AddressBook
     */
    public void printContact() {
        Contact person = new Contact();
        person.firstName = "Sirin";
        person.lastNmae = "Shaikh";
        person.address = "kolhapur";
        person.city = "Icgalkaranji";
        person.state = "Maharashtra";
        person.zipCode = 416115;
        person.mobileNumber = 998875550;
        person.emailId = "sirinshaikh942@gmail.com";
        System.out.println("Contact Details");
        System.out.println("Name          : " + person.firstName + " " + person.lastNmae + "\n" + "Address       : "
                + person.address + "\n" + "City          : " + person.city + "\n" + "State         : " + person.state
                + "\n" + "ZipCode       : " + person.zipCode + "\n" + "MobileNumber  : " + person.mobileNumber + "\n"
                + "EmailId       : " + person.emailId + "\n");
    }

    public static void main(String[] args) {
        /**
         * created instance of AddressBook class
         */
        AddressBook addressBook = new AddressBook();
        /**
         * Calling method printContact for displaying contacts
         */
        addressBook.printContact();

    }
}
