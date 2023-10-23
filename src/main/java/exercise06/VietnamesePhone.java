package exercise06;

import java.util.ArrayList;

public class VietnamesePhone extends Phone {
    // Nơi lưu trữ 1 danh sách các contact
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    @Override
    public void insertContact(String name, String phone) {
        Contact contact = new Contact(name, phone);
        contacts.add(contact);
    }

    @Override
    public void removeContact(String name) {
        contacts.removeIf(contact -> contact.getName().equals(name));
    }

    @Override
    public void updateContact(String name, String newPhone) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)){
                contact.setNumber(newPhone);
            }
        }
    }

    @Override
    public void searchContact(String name) {
        for (Contact contact: contacts) {
            if (contact.getName().equals(name)){
                System.out.println(contact);
            }
        }
    }

    public void getAllContact() {
        for (Contact contact : contacts){
            System.out.println(contact);
        }
    }
}
