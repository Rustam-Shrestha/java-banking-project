/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingprojectinjavanew;

/**
 *
 * @author Santosh Shrestha
 */

//importing all the important modules
import bankingprojectinjavanew.TransactionRedirector;
import javax.swing.*;
//like swing modules connection to extablish connection
import java.sql.*;
//database will serve as class that has method to create new data in our database
class Database {
    //creating data on personal named database
    public static void createEntity(String name, String father, String birth, String gender) {
        String url = "jdbc:mysql://localhost:3306/bankdb";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO personal (Name, Father, DOB, Gender) VALUES(?,?,?,?)";
            PreparedStatement statement = connect.prepareStatement(query);
            //sequentially assign the value
            statement.setString(1, name);
            statement.setString(2, father);
            statement.setString(3, birth);
            statement.setString(4, gender);
            // execute the statement given in sql
            
            int addedRow = statement.executeUpdate();
            if (addedRow > 0) {
                // alert user if data is insetred
                JOptionPane.showMessageDialog(null, "Congratulations ! Data Inserted Successfully");
            connect.close();
            }

//            connect.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could Not Communicate with database");

        }
    }
    //same thin in contact database
    public static void createEntityAgain(String email, String pass, String citi, String occu, String addre, int amt) {
        String url = "jdbc:mysql://localhost:3306/bankdb";
        String username = "root";
        String password = "";
        try {
            System.out.println("pass 1");
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection(url, username, password);
            System.out.println("pass 2");
            String query = "INSERT INTO contact (Email, Password, Citi_no, Occupation,Address, Balance) VALUES(?,?,?,?,?,?)";
            PreparedStatement statement = connect.prepareStatement(query);
            System.out.println("pass 3");
            statement.setString(1, email);
            statement.setString(2, pass);
            statement.setString(3, citi);
            statement.setString(4, occu);
            statement.setString(5, addre);
            statement.setInt(6, amt);
            System.out.println("pass 4");
            
            // execute the statement given in sql
            int addedRow = statement.executeUpdate();
            if (addedRow > 0) {
                // alert user if data is insetred
                JOptionPane.showMessageDialog(null, "Congratulations ! Data Inserted Successfully");
                 // After successfully inserting data, create and show the TransactionRedirector window
                 //using runnable interface for running the redirector file
                 //right after we insert our data in database
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Login();
                }
            });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could Not Communicate with database");

        }
    }

}

public class CreateUser {
    public static void main(String args[]) {
        Database d = new Database();
    }

}
