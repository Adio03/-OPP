package myPhoneBook;



public class Contact {


    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int ID;





    public Contact(String firstName,String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        allValidation(phoneNumber);
    }
    public String getFirstName() {return firstName;
    }

    public void setFirstName(String firstName) {this.firstName = firstName;
    }
    public String getLastName() {return lastName;
    }

    public void setLastName(String lastName) {this.lastName = lastName;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void allValidation(String phoneNumber){
        validatePhoneNumberLength(phoneNumber);
        validatePhoneNumbersCharacters(phoneNumber);
    }
    public void addPhoneNumberToContact(String phoneNumber) {this.phoneNumber = phoneNumber;
    }public String getContactPhoneNumber() {
        return phoneNumber;
    }
    public void validatePhoneNumberLength( String phoneNumber) {
        if (phoneNumber.length() == 14 || phoneNumber.length() == 11) this.phoneNumber = phoneNumber;
        else throw new IllegalArgumentException("The number you entered is not valid");
    }
    public void validatePhoneNumbersCharacters( String phoneNumber) {
        if (phoneNumber.matches("^\\+?\\d{1,3}?[-.\\s]?\\(?(\\d{3})\\)?[-.\\s]?\\d{3}[-.\\s]?\\d{4}$"))
            this.phoneNumber = phoneNumber;
        else throw new IllegalArgumentException("The number you entered is not valid");

}
    @Override
    public String toString(){
        return String.format("Firstname: "+firstName + "\nLastname: "+lastName + "\nPhone number:"+phoneNumber);
    }



}