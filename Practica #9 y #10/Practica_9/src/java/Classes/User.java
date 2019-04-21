/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Daniel
 */
public abstract class User {
    protected String name;
    protected String email;
    protected String pass;
    protected String bday;
    protected String type;
    
    public User(){
    }
    
    public User (String name, String email, String pass, String bday){
        setName(name);
        setEmail(email);
        setPass(pass);
        setBday(bday);
    }

    public String getName() {
        return name;
    }

    public void setName(String nombreusu) {
        this.name = nombreusu;
    }

     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }


    public void setPass(String pass) {
        this.pass = pass;
    }


    public String getBday() {
        return bday;
    }

    public void setBday(String cumple) {
        this.bday = cumple;
    }

    public String getType() {
        return type;
    }

    public abstract void setType(String type);
}