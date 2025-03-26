package org.megyamaszek.ponte.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

@Entity
@Table(name = "contacts")
public class ContactModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonFormat
    private int id;
    @JsonFormat
    private String name;
    @JsonFormat
    private String phone;
    @JsonFormat
    private String email;
    @JsonFormat
    private String address;

}
