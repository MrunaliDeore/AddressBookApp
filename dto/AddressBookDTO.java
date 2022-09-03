package com.example.adressbookapp.dto;

import com.example.adressbookapp.entity.AddressBook;

import javax.persistence.Id;
import javax.validation.constraints.Pattern;

public class AddressBookDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee firstname name is Invalid")
    public
    String firstname;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee lastname name is Invalid")
    public
    String lastname;


}
