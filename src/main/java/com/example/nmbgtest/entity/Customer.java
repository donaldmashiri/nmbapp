package com.example.nmbgtest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String surname;

    private String nationalID;

    private String title;

    private String homeowner;

    private String email;

//    @Column(name = "Creationdate", nullable = false)
    private Date Creationdate;

    private String gender;

    private String username;

//    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
    private List<Account> accounts;

}
