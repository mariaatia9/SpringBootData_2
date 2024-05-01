/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.configuration;

import com.github.javafaker.Faker;
import com.ibb.model.Person;
import com.ibb.repository.DaoController;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

/**
 *
 * @author trainer
 */
public class BootStrap implements InitializingBean {

    @Autowired
    private DaoController daoController;

    

    @Override
    public void afterPropertiesSet() throws Exception {
        Faker f = new Faker();
        for (int i = 1; i < 10; i++) {
            Person p = new Person(f.address().firstName(), f.address().lastName());
            daoController.save(p);
        }
    }

}
