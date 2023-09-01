package com.utez.edu.mx.capacitacionstruts.person.action;

import com.opensymphony.xwork2 .ActionSupport;
import com.utez.edu.mx.capacitacionstruts.person.bean.BeanPersona;
import com.utez.edu.mx.capacitacionstruts.person.dao.DaoPersona;

import java.util.ArrayList;
import java.util.List;

public class ActionPersona extends ActionSupport {
    DaoPersona daoPersona= new DaoPersona();
    List<BeanPersona> personas;

    public String consultarPersonas(){
        System.out.println("llego");
        personas = new ArrayList<>();
        personas = daoPersona.getAllPeople();
        for(BeanPersona persona: personas){
            System.out.println(persona.getName());

        }
        return SUCCESS;
    }
}
