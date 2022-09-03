package com.example.adressbookapp.entity;

import com.example.adressbookapp.dto.AddressBookDTO;

import javax.persistence.*;

@Entity
@Table(name = "addressbook")
public class AddressBook {

    @Id
    @GeneratedValue
    private int id;

    public AddressBook(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //other feilds
    String firstname;
    String lastname;
    int phonenum;
    String emailid;
    String address;

    public  AddressBook() {}

    //generates constrctor

    public AddressBook(AddressBook addressBook) {
        this.firstname = addressBook.firstname;
        this.lastname = addressBook. lastname;
        this.phonenum = addressBook.phonenum;
        this.emailid = addressBook.emailid;
        this.address = addressBook.address;
    }

    //generate getter setter
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //dto costructor generate for add
    public AddressBook(AddressBookDTO addressBookDTO) {
        this.id = id;
        this.firstname = addressBookDTO.firstname;
        this.lastname = addressBookDTO.lastname;
    }

    //generete constructor for update
    public AddressBook(int id, AddressBook addressBook) {
        this.id = id;
        this.firstname = addressBook.firstname;
        this.lastname = addressBook.lastname;
    }
}
