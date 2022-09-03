package com.example.adressbookapp.controller;


import com.example.adressbookapp.dto.AddressBookDTO;
import com.example.adressbookapp.entity.AddressBook;
import com.example.adressbookapp.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class AddressBookController {
    @Autowired
    AddressBookService addressBookService;

    //ptint welcome msg
    @GetMapping("/welcomemsg")
    public String getMessage() {
        return addressBookService.getMessage();
    }

    //add data
    @PostMapping("/add")
    public AddressBookDTO createUser(@Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBook user1 = new AddressBook(addressBookDTO);
        addressBookService.addData(user1);
        return addressBookDTO;
    }

    //post method
    @PostMapping("/post")
    public List<AddressBook> listofAll (){
        List<AddressBook> response = addressBookService.listAll();
        return response;
    }

    //get data by id from table - get method
    @GetMapping("/get/{id}")
    public Optional<AddressBook> getById (@PathVariable int id){
        Optional<AddressBook> response = addressBookService.getById(id);
        return response;
    }

    //delete by id - delete method
    @DeleteMapping ("/delete/{id}")
    public String  deleteUser (@PathVariable int id){
        String response = addressBookService.deleteById(id);
        return response;
    }

    //update by id - put method using
    @PutMapping("update/{id}")
    public AddressBook editEmployee(@RequestBody AddressBook addressBook, @PathVariable int id) {
        return addressBookService.editEmployee(addressBook, id);
    }
}
