/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ibb.repository;

import com.ibb.model.Person;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author trainer
 */
public interface DaoController extends JpaRepository<Person, Integer>{
    
     @Query("SELECT p FROM Person AS p WHERE p.personId=:pId AND p.firstname=:pName") 
   public Person getPersonByName(Integer pId,String pName);
   
     @Query("SELECT p FROM Person AS p WHERE p.personId=:pId") 
   public Person getPersonById(Integer pId);
   
    @Query("SELECT p FROM Person AS p") 
   public List<Person> getPersonList();
}
