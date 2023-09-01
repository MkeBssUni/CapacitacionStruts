package com.utez.edu.mx.capacitacionstruts.person.dao;

import com.utez.edu.mx.capacitacionstruts.person.bean.BeanPersona;
import com.utez.edu.mx.capacitacionstruts.utils.MySQLConnection;
import org.apache.struts2.components.Bean;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoPersona {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    final String queryGetAllPeople = "SELECT * FROM people;";
    final String queryGetPerson = "SELECT * from people where idPerson = ?;";
    public List<BeanPersona> getAllPeople(){
        List<BeanPersona> personas = new ArrayList<>();
        try{
            con = MySQLConnection.getConnection();
            ps= con.prepareStatement(queryGetAllPeople);
            rs= ps.executeQuery();

            while(rs.next()){
                BeanPersona persona = new BeanPersona();
                persona.setIdPerson(rs.getInt("idPerson"));
                persona.setName(rs.getString("name"));
                persona.setBirthdate(rs.getString("birthdate"));
                persona.setGender(rs.getString("gender").charAt(0));
                persona.setLastname(rs.getString("lastname"));
                persona.setSurname(rs.getString("surname"));

                personas.add(persona);
            }
        }catch(SQLException e){
            Logger.getLogger(DaoPersona.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            try{
                if(rs != null){
                    rs.close();
                }
                if(con != null){
                    con.close();
                }
                if(ps != null){
                    ps.close();
                }
            }catch(SQLException e){
                Logger.getLogger(DaoPersona.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return personas;
    }

    public BeanPersona getPerson(int idPerson){
        BeanPersona persona = new BeanPersona();
        try {
            con = MySQLConnection.getConnection();
            ps = con.prepareStatement(queryGetPerson);
            ps.setInt(1, idPerson);
            rs = ps.executeQuery();

            while(rs.next()){
                persona.setIdPerson(rs.getInt("idPerson"));
                persona.setName(rs.getString("name"));
                persona.setLastname(rs.getString("lastname"));
                persona.setSurname(rs.getString("surname"));
                persona.setGender(rs.getString("gender").charAt(0));
                persona.setBirthdate(rs.getString("birthdate"));
            }
        }catch (SQLException e){
            Logger.getLogger(DaoPersona.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            try{
                if(rs != null){
                    rs.close();
                }
                if(con != null){
                    con.close();
                }
                if(ps != null){
                    ps.close();
                }
            }catch(SQLException e){
                Logger.getLogger(DaoPersona.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return persona;
    }
}
