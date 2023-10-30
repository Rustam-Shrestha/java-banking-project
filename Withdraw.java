package bankingprojectinjavanew;

//importing all the necessary pacakges
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Statement;


//making gui fragmensts as a class extending jframe 
public class Withdraw extends JFrame {
//    creating jframe as a new object instance
    private JPanel jp = new JPanel();
    ////creating all te labels and necessary components for our further gui operations
    private JLabel jl = new JLabel("Withdraw");
    private JLabel wam = new JLabel("Withdraw Amount (Rs. )");
    private JTextField wtf=new JTextField();
    private JButton wdb=new JButton("Withdraw");

    //method that does alll the operatoions 
    public Withdraw(String e, String p) {
        jp.add(jl);
        add(jp);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close this window only
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
