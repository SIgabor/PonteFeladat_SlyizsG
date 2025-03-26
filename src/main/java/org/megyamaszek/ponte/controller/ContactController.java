package org.megyamaszek.ponte.controller;

import org.megyamaszek.ponte.model.ContactModel;
import org.megyamaszek.ponte.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactService service;

    @GetMapping("/")
    public String greet() {
        return "Hello Ponte!";
    }

    @GetMapping("/getAllContacts")
    public List<ContactModel> getAllContacts(){
        return service.getAllContacts();
    }

    @GetMapping("/findByName/{name}")
    public ContactModel findByName(@PathVariable String name){
        return service.findeByName(name);
    }

    @GetMapping("/findByEmail/{email}")
    public ContactModel findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

    @GetMapping("/findByPhone/{phone}")
    public ContactModel findByPhone(@PathVariable String phone){
        return service.findByPhone(phone);
    }

    @PostMapping("/addContact")
    public ContactModel addContact(@RequestBody ContactModel contact){
        return service.addContact(contact);
    }

    @DeleteMapping("/deleteContact/{id}")
    public void deleteContact(@PathVariable int id){
        service.deleteContactById(id);
    }

}
