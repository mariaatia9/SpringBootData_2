/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.ctrl;

import com.ibb.repository.DaoController;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author trainer
 */
@Controller
@Data
@RequestMapping(path = "/web")
public class MyWebController {
    @Autowired
    private DaoController daoController;
    
    
    @GetMapping(path = "/listPerson")
    public ModelAndView getList(){
        Integer persId=0;
        ModelAndView m=new ModelAndView("index.html");
        m.addObject("listPerson", daoController.findAll());
        m.addObject("persId", persId);
        return m;
    }
    
    @PostMapping(path = "/getPerson")
    public ModelAndView gelPerson(@RequestParam Integer id){
        ModelAndView m=new ModelAndView("index.html");
        m.addObject("listPerson", daoController.getPersonById(id));
        
        return m;
    }
    
}
