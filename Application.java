/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingprojectinjavanew;

/**
 *
 * @author admin
 */
//importing the panel where our content will be displayed
//imporing all the swing classes to be used
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIFrag1 {

    private String passName;
    private String passFather;
    private String passBirth;
    private String radio_sel;
//first part of application form

    public GUIFrag1() {
        // creating a lable panel with application form heading
        JFrame container = new JFrame("User Application Form 1/2");

        //-----------------------------
        // label for name
        JLabel name_l = new JLabel("Account holder Name");
        // bounds and sixe
        name_l.setBounds(230, 170, 140, 30);
        // adding comonent
        container.add(name_l);
        // textbox of name
        JTextField name_tf = new JTextField();
        name_tf.setBounds(375, 170, 170, 30);
        container.add(name_tf);
        //-----------------------------

        //-----------------------------
        // label for father name
        JLabel father_l = new JLabel("Father Name");
        // bounds and sixe
        father_l.setBounds(230, 240, 140, 30);
        // adding comonent
        container.add(father_l);
        // textbox of name
        JTextField father_tf = new JTextField();
        father_tf.setBounds(375, 240, 170, 30);
        container.add(father_tf);
        //-----------------------------

        //-----------------------------
        // label for dob
        JLabel dob_l = new JLabel("Date of Birth");
        // bounds and sixe
        dob_l.setBounds(230, 310, 140, 30);
        // adding comonent
        container.add(dob_l);
        // textbox of name
        JTextField dob_tf = new JTextField("dd/mm/yyyy");
        dob_tf.setBounds(375, 310, 170, 30);
        container.add(dob_tf);
        //-----------------------------

        //-----------------------------
        // label for gender
        JLabel gender_name_label = new JLabel("Gender");
        // bounds and sixe
        gender_name_label.setBounds(230, 380, 140, 30);
        // adding comonent
        container.add(gender_name_label);
        // textbox of gender
        JRadioButton jrbm = new JRadioButton("Male");
        JRadioButton jrbf = new JRadioButton("Female");
        JRadioButton jrbn = new JRadioButton("Neuter");
        jrbm.setBounds(370, 380, 75, 30);
        jrbf.setBounds(470, 380, 75, 30);
        jrbn.setBounds(570, 380, 75, 30);
        container.add(jrbm);
        container.add(jrbf);
        container.add(jrbn);
        //-----------------------------

        //-----------------------------
        ButtonGroup rbgroup = new ButtonGroup();
        rbgroup.add(jrbm);
        rbgroup.add(jrbf);
        rbgroup.add(jrbn);
        //-----------------------------

        //----------------------------
        JButton btn = new JButton("Submit");
        btn.setBounds(400, 445, 108, 30);
        container.add(btn);
        //-----------------------------

        //-----------------------------
        JLabel cpy_l = new JLabel("Copyright &copy; 2023 Santosh Shrestha");
        // bounds and sixe
        cpy_l.setBounds(230, 620, 800, 30);
        // adding comonent
        container.add(cpy_l);
        //-----------------------------

        // specifying jframe properties
        container.setSize(800, 650);
        container.setLayout(null);
        container.setVisible(true);
        container.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ActionListener clickedSubmit;
        clickedSubmit = new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                passName = name_tf.getText();
                passFather = father_tf.getText();
                passBirth = dob_tf.getText();
                radio_sel = "";
                if (jrbm.isSelected()) {
                    radio_sel = "male";
                } else if (jrbf.isSelected()) {
                    radio_sel = "female";
                } else if (jrbn.isSelected()) {
                    radio_sel = "neuter";
                } else {
                    radio_sel = "neuter";
                }
                if(passName.length()>=5&&passFather.length()>=5&&radio_sel.length()>=3){
                    GUIFrag2 redirect = new GUIFrag2(passName, passFather, passBirth, radio_sel);
                }else{
                    JOptionPane.showMessageDialog(null, "too low data");
                }
            }
        };
        btn.addActionListener(clickedSubmit);

    }
}

class GUIFrag2 {

    public GUIFrag2(String passName, String passFather, String passBirth, String radio_sel) {

        // creating a lable panel with application form heading
        JFrame container = new JFrame("User Application Form 2/2");

        //-----------------------------
        // label for Email
        JLabel email_l = new JLabel("E-Mail");
        // bounds and sixe
        email_l.setBounds(230, 170, 140, 30);
        // adding comonent
        container.add(email_l);
        // textbox of name
        JTextField email_tf = new JTextField();
        email_tf.setBounds(375, 170, 170, 30);
        container.add(email_tf);
        //-----------------------------

        //-----------------------------
        // label for Password name
        JLabel pass_l = new JLabel("Password");
        // bounds and sixe
        pass_l.setBounds(230, 240, 140, 30);
        // adding comonent
        container.add(pass_l);
        // textbox of password

        JPasswordField pass_tf = new JPasswordField();
        pass_tf.setBounds(375, 240, 170, 30);
        container.add(pass_tf);
        //-----------------------------

        //-----------------------------
        // label for dob
        JLabel citi_l = new JLabel("Citizenship no");
        // bounds and sixe
        citi_l.setBounds(230, 310, 140, 30);
        // adding comonent
        container.add(citi_l);
        // textbox of name
        JTextField citi_tf = new JTextField();
        citi_tf.setBounds(375, 310, 170, 30);
        container.add(citi_tf);
        //-----------------------------

        //-----------------------------
        // label for occu
        JLabel occu_l = new JLabel("Occupation");
        // bounds and sixe
        occu_l.setBounds(230, 380, 140, 30);
        // adding comonent
        container.add(occu_l);

        JTextField occu_tf = new JTextField();
        occu_tf.setBounds(375, 380, 170, 30);
        container.add(occu_tf);
        //-----------------------------

        //-----------------------------
        // label for Address
        JLabel addr_l = new JLabel("Address");
        // bounds and sixe
        addr_l.setBounds(230, 450, 140, 30);
        // adding comonent
        container.add(addr_l);

        JTextField addr_tf = new JTextField();
        addr_tf.setBounds(375, 450, 170, 30);
        container.add(addr_tf);
        //-----------------------------

        //-----------------------------
        // label for Balance
        JLabel bal_l = new JLabel("Amount");
        // bounds and sixe
        bal_l.setBounds(230, 520, 140, 30);
        // adding comonent
        container.add(bal_l);

        JTextField bal_tf = new JTextField();
        bal_tf.setBounds(375, 520, 170, 30);
        container.add(bal_tf);
        //-----------------------------

        //-----------------------------
        //----------------------------
        JButton btn2 = new JButton("Submit");
        btn2.setBounds(400, 590, 108, 30);
        container.add(btn2);
        //-----------------------------

        // specifying jframe properties
        container.setSize(800, 690);
        container.setLayout(null);
        container.setVisible(true);
        container.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            //pasing balance must be final so this is  done and IDK why this is
        ActionListener clickedSubmit2;
        clickedSubmit2 = new ActionListener() {
            
            
          
            public void actionPerformed(ActionEvent e) {
            String passEmail = email_tf.getText();
            String passPass = new String(pass_tf.getPassword());
            String passCiti = citi_tf.getText();
            String passOccu = occu_tf.getText();
            String passAddr = addr_tf.getText();
            String getBal = bal_tf.getText();
            int passBal = Integer.parseInt(getBal);
                if (passEmail.length() >= 7 && passPass.length() >= 8 && passCiti.length() >= 3 && passOccu.length() >= 4&&passBal>200) {
                    Database.createEntity(passName, passFather, passBirth, radio_sel);
                    Database.createEntityAgain(passEmail, passPass, passCiti, passOccu, passAddr, passBal);
                } else {
                    JOptionPane.showMessageDialog(null, "too low data");
                }
            }
        };
        btn2.addActionListener(clickedSubmit2);
    }

}





public class Application {

    public static void main(String[] args) {
        GUIFrag1 frag1 = new GUIFrag1();
    }

}
