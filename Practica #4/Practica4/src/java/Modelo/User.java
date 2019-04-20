/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Daniel
 */
public class User {
    String name, correo, password, birthday;
   
    
    
    public User(String name, String correo, String password, String birthday){
    this.name = name;
    this.correo = correo;
    this.password = password;
    this.birthday = birthday;
    
    }
}