/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author Trainer
 */
@Data
@Table(name = "person")
@Entity
public class Person {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personId;
    private String firstname;
    private String lastname;
 //   private LocalDate birthdate;
//    @OneToOne(cascade = CascadeType.ALL)
//    private Adresse adresse;
//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "person_id")
//    //@JoinColumn(name = "personId",referencedColumnName = "personId")
//    private List<Emails> emails;
////    @Temporal(TemporalType.DATE)
////    private Date since;

    public Person() {
//        adresse=new Adresse();
//     emails=new ArrayList<>();
    }

    public Person(String firstname, String lastname) {
        this();
        this.firstname = firstname;
        this.lastname = lastname;
       
    }
    
}
