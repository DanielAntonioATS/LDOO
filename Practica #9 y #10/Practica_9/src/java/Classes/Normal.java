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
public class Normal extends User{
    private String fullname, subscription, adress;
    
    public Normal(){
        
    }
    
    public Normal(String name, String email, String pass, String bday, String fullname, String subscription, String adress){
        setName(name);
        setEmail(email);
        setPass(pass);
        setBday(bday);
        setFullName(fullname);
        setSubscription(subscription);
        setAdress(adress);
        setType("normal");
    }
    
    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullname) {
        this.fullname = fullname;
    }
    
    public String getSubscription() {
        return subscription;
    }


    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    
    public void setType(String type){
        this.type = type;
    }
}