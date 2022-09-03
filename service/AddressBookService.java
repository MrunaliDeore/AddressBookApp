package com.example.adressbookapp.service;

import com.example.adressbookapp.dto.AddressBookDTO;
import com.example.adressbookapp.entity.AddressBook;
import com.example.adressbookapp.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressBookService {
    //print welcome message
    public static String getMessage() {
        return "Hello Welcome to the Address Book App...!";
    }
    @Autowired
    AddressBookRepository addressBookRepository;

    //add data into addressbook table
    public AddressBook addData(AddressBook addressbook) {
        addressBookRepository.save(addressbook);
        return addressbook;
    }

    //show all data in the DB post method using
    public List<AddressBook> listAll() {
        return addressBookRepository.findAll();
    }

    //get data by id
    public Optional<AddressBook> getById(int id) {
        return addressBookRepository.findById(id);
    }

    //delete by id from table
    public String deleteById(int id) {
        addressBookRepository.deleteById(id);
        return "AddressBook id "+id+" is Deleted Successfully...!";
    }

    //update by id
    public AddressBook editEmployee(AddressBook addressBook, int id) {
        if (addressBookRepository.findById(id).isPresent()) {
            AddressBook newData = new AddressBook(id, addressBook);
            return addressBookRepository.save(newData);
        }
        return addressBook;
    }
}
