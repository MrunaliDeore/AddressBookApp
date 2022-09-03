package com.example.adressbookapp.controller;


import com.example.adressbookapp.dto.AddressBookDTO;
import com.example.adressbookapp.dto.ResponseDTO;
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
    public ResponseEntity<ResponseDTO> createUser(@Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBook user1 = new AddressBook(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("New AddressBook Created Successfully", addressBookService.addData(user1));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    //post method
    @PostMapping("/post")
    public ResponseEntity<ResponseDTO> listofAll (){
        ResponseDTO responseDTO = new ResponseDTO("List of All Data in the Database", addressBookService.listAll());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    //get data by id from table - get method
    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getById (@PathVariable int id){
        ResponseDTO responseDTO = new ResponseDTO("Get data by ID id :", addressBookService.getById(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    //delete by id - delete method
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddress(@PathVariable int id) {
        ResponseDTO responseDTO = new ResponseDTO("AddressBook Deleted Successfully", addressBookService.deleteById(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    //update by id - put method using
    @PutMapping("update/{id}")
    public ResponseEntity<ResponseDTO> editEmployee(@Valid @RequestBody AddressBook addressBook, @PathVariable int id) {
        ResponseDTO responseDTO = new ResponseDTO("AddressBook Updated Successfully", addressBookService.editAddress(addressBook,id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
