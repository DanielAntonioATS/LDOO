/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.HashMap;
import Classes.Guest;
import Classes.Admin;

/**
 *
 * @author Daniel
 */
    

public class UsersFactory {
    private static UsersFactory factory;
    private HashMap<String, User> userHash = new HashMap();

    private UsersFactory(){
    }
    
    public static UsersFactory Factory(){
        if (factory==null){
            factory = new UsersFactory();
        }
        return factory;
    }
    
    
    public static User newU(String type, String name, String email, String pass, String bday, int numemple, String fullname, String subscription, String adress){
        if(type.equals("admin")){
            return new Admin(name, email, pass, bday,  numemple);
            
            }else if (type.equals("normal")){
                return new Normal(name, email, pass, bday,  fullname, subscription, adress);
            }
                return new Guest(name, email, pass, bday,  fullname);
    } 
    
        public User obtenerUser (String name){
            return userHash.get(name);
        }

    /**
     *
     * @param type
     * @param name
     * @param email
     * @param pass
     * @param bday
     * @param fullname
     * @param subscription
     * @param adress
     * @param numemple
     */
    public void addU(String type, String name, String email, String pass, String bday,String fullname, String subscription, String adress, int numemple) {
        if (userHash.get(name) == null){
        userHash.put(name, newU(type, name, email, pass, bday,  numemple, fullname, subscription, adress));
    }
}

    public void newU(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

