package bankingprojectinjavanew;
// MAKING IMPORTS FROM SWINGG AWT AND HAVING ACTION LISTENER
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TRANSATION REDIRECTOR THAT WILL DO ALL THE REDIRECTION WORKS
public class TransactionRedirector extends JFrame {
    public TransactionRedirector(){
    //JPANEL THAT WILL HAVE FLOW LAYOUT CONVENTION
    JPanel jp = new JPanel(new FlowLayout());
    
    //TWO BUTTONS THAT WILL DO REDIRECTION WORKS
    JButton wd = new JButton("Withdraw");
    JButton dp = new JButton("Deposit");

    //THE ACTUAL REDIRECTOR CONSTRUCTOR THAT WILL DO THE  WORK
        
        //THE JPANEL WILL HAVE THE ELEMENTS WE WANT TO HAVE 
        jp.add(wd);
        jp.add(dp);
        
//        ADDING JPANEL TO THE JFRAME 
        add(jp);  // Add the panel to the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
        //when clicking the withdraw button we get these action
        wd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eve){
            }
        });
        //clicking deposiyt button
        dp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent eve){
               new  Deposit();
            }
        });
    }
    

   public static void main(String[] args) {
//       MAKING RUNNABLE THREAD AND USING TO INVOKE OUR CNSTRUCTOR FUNCITON WE CREAETED
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        //making runnable thread from swing utiities
        public void run() {
            new TransactionRedirector();
        }
    });
}

    
}
