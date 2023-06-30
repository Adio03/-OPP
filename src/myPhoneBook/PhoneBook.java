package myPhoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PhoneBook {
    private int contactCounter = 0;
    private final List<Contact> contacts = new ArrayList<>();

    public void createContact(String firstName, String lastName, String phoneNumber) {
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        int generate = generateIdForEveryContactCreated();
        contact.setID(generate);
        contacts.add(contact);
        contactCounter++;


    }

    public int contactCreatedSize() {
        return contacts.size();
    }

            public Optional<Contact> searchContactByFirstName(String firstName) {
        for (Contact contact : contacts)
            if (firstName.equals(contact.getFirstName()))
                return Optional.of(contact);
        throw new IllegalArgumentException("the contact does not exit");
    }

    public Optional<Contact> searchContactByLastName(String lastName) {
        for (Contact contact : contacts)
            if (lastName.equals(contact.getLastName()))
                return Optional.of(contact);
        throw new IllegalArgumentException("the contact does not exist");

    }
    public Optional<Contact> searchContactByPhoneNumber(String phoneNumber) {
        for (Contact contact : contacts)
            if (phoneNumber.equals(contact.getContactPhoneNumber()))
                return Optional.of(contact);
        throw new IllegalArgumentException("the contact does not exist");
    }
    public void displayAllContact() {
        for (Contact contact : contacts)
            System.out.println(contact.toString());
    }
    public int generateIdForEveryContactCreated() {
        return contactCounter + 1;
    }

    public void deleteContactById(int contactId) {
        for (Contact contact : contacts) {
            if (contact.getID() == contactId)
                contacts.remove(contactId);
            contactCounter--;
            break;
        }

    }
    public Optional<Contact> updateContactPhoneNumber(String oldPhoneNumber, String newPhoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getContactPhoneNumber().equals(oldPhoneNumber))
                contact.addPhoneNumberToContact(newPhoneNumber);
            return Optional.of(contact);
        }
        throw new IllegalArgumentException("the Phone number you input doesn't exist");
    }

    public Optional<Contact> updateContactFirstName(String oldFirstName, String newFirstName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(oldFirstName))
                contact.setFirstName(newFirstName);
            return Optional.of(contact);
        }
        throw new IllegalArgumentException("the name you input doesn't exist");
    }
    public Optional<Contact> updateContactLastName(String oldLastName, String newLastName) {
        for (Contact contact : contacts) {
            if (contact.getLastName().equals(oldLastName))
                contact.setLastName(newLastName);
            return Optional.of(contact);
        }
        throw  new IllegalArgumentException("the name you input doesn't exist");
    }

}