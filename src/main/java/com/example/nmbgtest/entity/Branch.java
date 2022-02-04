package com.example.nmbgtest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "branch_tbl")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String branch_name;

//    @OneToOne(mappedBy = "branch", cascade = CascadeType.ALL)
//    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
//    private Account myaccount;



}
