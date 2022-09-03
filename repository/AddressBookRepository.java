package com.example.adressbookapp.repository;

import com.example.adressbookapp.dto.AddressBookDTO;
import com.example.adressbookapp.entity.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBook,Integer> {
}
