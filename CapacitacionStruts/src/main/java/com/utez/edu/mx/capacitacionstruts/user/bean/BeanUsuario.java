package com.utez.edu.mx.capacitacionstruts.user.bean;

import com.utez.edu.mx.capacitacionstruts.person.bean.BeanPersona;

public class BeanUsuario {
    long idUser;
    String username;
    boolean status;
    long idPerson;
    BeanPersona persona;

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(long idPerson) {
        this.idPerson = idPerson;
    }

    public BeanPersona getPersona() {
        return persona;
    }

    public void setPersona(BeanPersona persona) {
        this.persona = persona;
    }
}
