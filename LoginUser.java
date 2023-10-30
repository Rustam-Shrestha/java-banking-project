/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingprojectinjavanew;

/**s
 *
 * @author admin
 * 
 * 
 */
//importing all the important modules
import javax.swing.*;
//like swing modules connection to extablish connection
import java.sql.Connection;
//driver mato assist connection

import java.sql.DriverManager;
//and prepared statement to execure  query in our sql database
import java.sql.PreparedStatement;

import java.sql.ResultSet;
//credChecker will serve as class that contains the middleware to compare the credentials fed and credentials that are in database
class CredChecker{
    //this is middleware that takes email and password and does alll eopraton between data fed and SQL database
    public static void getCred(String email, String pass) {
        String url = "jdbc:mysql://localhost:3306/bankdb";
        String username = "root";
        String password = "";
        try {
            System.out.println("first pass");
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection(url, username, password);
            String query = "SELECT * from contact WHERE Email=? AND Password=?";
            // execute the statement given in sql
             PreparedStatement preparedStatement = connect.prepareStatement(query);
            System.out.println("Second  pass");
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, pass);
            System.out.println("Third  pass");

            System.out.println("Fourth  pass");

            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Fifih  pass");
            if (resultSet.next()) {
                // User login successful
            JOptionPane.showMessageDialog(null, "User is in database");
            
                // You can do further actions here
            } else {
                // Invalid credentials
            JOptionPane.showMessageDialog(null, "incorrect data fed");
            }
            System.out.println("sixth  pass");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could Not Communicate with database");

        }
    }


}
public class LoginUser {
    public static void main(){
    }
}
