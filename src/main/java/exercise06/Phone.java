package exercise06;


import java.util.ArrayList;

public abstract class Phone {
    private ArrayList<Contact> contacts;
    public abstract void insertContact(String name, String phone);
    public abstract void removeContact(String name);
    public abstract void updateContact(String name, String newPhone);
    public abstract void searchContact(String name);
    public abstract void getAllContact();

}
