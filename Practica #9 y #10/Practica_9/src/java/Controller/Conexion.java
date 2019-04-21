/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Daniel
 */
public class Conexion{  
private String D="com.mysql.jdbc.Driver";  
private String URL="jdbc:derby://localhost:1527/Practica9";  
private String Name="root";  
private String Pass="root";  
public Connection connection;

   public Conexion(){        
    try{  
        Class.forName(D);  
        connection = DriverManager.getConnection(URL,Name,Pass);  
            }catch (ClassNotFoundException | SQLException e ){
            System.err.println("error" + " " + e);
         }
}
        public Connection getConexion(){
            return connection;
    }
}