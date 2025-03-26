package org.megyamaszek.ponte.service;

import org.megyamaszek.ponte.model.ContactModel;
import org.megyamaszek.ponte.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepo repo;

    public ContactModel addContact(ContactModel contact) {
        return repo.save(contact);
    }

    public List<ContactModel> getAllContacts() {
        return repo.findAll();
    }

    public void deleteContactById(int id) {
        repo.deleteById(id);
    }

    public ContactModel findeByName(String name) {
        return repo.findByName(name);
    }

    public ContactModel findByEmail(String email) {
        return repo.findByEmail(email);
    }

    public ContactModel findByPhone(String phone) {
        return repo.findByPhone(phone);
    }

}
