package com.example.adressbookapp.dto;

import com.example.adressbookapp.entity.AddressBook;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

public class AddressBookDTO {
    @NotEmpty
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$")
    public String firstname;

    @NotEmpty
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$")
    public String lastname;

    @NotEmpty
    public String address;
}
