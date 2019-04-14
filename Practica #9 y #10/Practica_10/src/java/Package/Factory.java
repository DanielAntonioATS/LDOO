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
public class Factory {

   public static void main(String[] args) {
      UserFactory userFactory = new UserFactory();

      //get an object of Circle and call its draw method.
      User admin = userFactory.getUser("Admin");

      //call draw method of Circle
      admin.draw();

      //get an object of Rectangle and call its draw method.
      User user = userFactory.getUser("User");

      //call draw method of Rectangle
      user.draw();

      //get an object of Square and call its draw method.
      User guest = userFactory.getUser("Guest");

      //call draw method of square
      guest.draw();
   }
}