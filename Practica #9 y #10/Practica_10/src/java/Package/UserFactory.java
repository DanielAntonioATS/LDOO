/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

/**
 *
 * @author Daniel
 */
public class UserFactory {
	
   //use getShape method to get object of type shape 
   public User getUser(String userType){
      if(userType == null){
         return null;
      }		
      if(userType.equalsIgnoreCase("Admin")){
         return new Admin();
         
      } else if(userType.equalsIgnoreCase("Guest")){
         return new Guest();
         
      } else if(userType.equalsIgnoreCase("User")){
         return new NormalUser();
      }
      
      return null;
   } 
} 