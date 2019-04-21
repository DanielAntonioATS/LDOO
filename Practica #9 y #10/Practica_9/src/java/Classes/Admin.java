/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.sql.SQLException;
/**
 *
 * @author Daniel
 */
public class Admin extends User{
    private int numemple;
    
    public Admin(){
        
    }
    
    public Admin (String name, String email, String pass, String bday, int numemple){
        setName(name);
        setEmail(email);
        setPass(pass);
        setBday(bday);
        setNumEmple(numemple);
        setType("admin");
    }

    public int getNumEmple() {
        return numemple;
    }

    public void setNumEmple(int numemple) {
        this.numemple = numemple;
    }
    
    public void setTipo(String type){
        this.type = type;
    }

    @Override
    public void setType(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
