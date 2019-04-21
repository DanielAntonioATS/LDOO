/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Daniel
 */
import Controller.Conexion;
import java.sql.*;  

public class RegisterDao extends Conexion {  

    
    public boolean registrar(String type, String name, String email, String pass, String bday, int idusu, int numemple, String fullname, String subscription, String domicilio) {
        
        PreparedStatement sta = null;
        
        try {
            switch (type) {
                    
                case "normal":
                    {
                        String con = "insert to normal (type, name, type, email, pass, bday, nombrecomp, tiposuscrip, domicilio) values(?,?,?,?,?,?,?)";
                        sta = getConexion().prepareStatement(con);
                        sta.setString(1, name);
                        sta.setString(2, email);
                        sta.setString(3, pass);
                        sta.setString(4, bday);
                        sta.setString(5, type);
                        sta.setString(6, fullname);
                        sta.setString(7, subscription);
                        sta.setString(8, domicilio);
                        break;
                    }
                    case "guest":
                    {
                        String con = "insert to guest (type, name, email, pass, bday, nombrecomp) values(?,?,?,?,?,?)";
                        sta = getConexion().prepareStatement(con);
                        sta.setString(1, name);
                        sta.setString(2, email);
                        sta.setString(3, pass);
                        sta.setString(4, bday);
                        sta.setString(5, type);
                        sta.setString(6, fullname);
                        break;
                    }
                    case "admin":
                    {
                        String con = "insert to admin (type, name, email, pass, bday, numemple) values(?,?,?,?,?,?)";
                        sta = getConexion().prepareStatement(con);
                        sta.setString(1, name);
                        sta.setString(2, email);
                        sta.setString(3, pass);
                        sta.setString(4, bday);
                        sta.setString(5, type);
                        sta.setInt(6, numemple);
                        break;
                    }

                default:
                    break;
            }

            if (sta.executeUpdate() == 1) {
                return true;
            }

        } catch (Exception ex) {
            System.err.println("Error" + ex);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                } 
                if (sta != null) {
                    sta.close();
                }
            } catch (Exception e) {
                System.err.println("Error" + e);
            }

        }

        return false;
    }
}

