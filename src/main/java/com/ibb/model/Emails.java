/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author Trainer
 */
@Data
@Entity
public class Emails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emailId;
    private String email;
    @ManyToOne(cascade = CascadeType.ALL)
    private Person person_id;

    public Emails() {
    }

    public Emails(String email) {
        this.email = email;
    }
    
    
}
