package org.megyamaszek.ponte.repo;

import org.megyamaszek.ponte.model.ContactModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepo extends JpaRepository<ContactModel, Integer> {
    ContactModel findByName(String name);
    ContactModel findByEmail(String email);
    ContactModel findByPhone(String phone);
}
