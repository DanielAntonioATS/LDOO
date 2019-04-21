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
public class Guest extends User{
    private String fullname;
    
    public Guest(){
        
    }
    
    public Guest(String name, String email, String pass, String bday,String fullname){
        setName(name);
        setEmail(email);
        setPass(pass);
        setBday(bday);
        setFullName(fullname);
        setType("guest");
    }

    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullname) {
        this.fullname = fullname;
    }

    public void setType(String type){
        this.type = type;
    }
}