package bankingprojectinjavanew;

import javax.swing.*;
import java.awt.*;

public class Deposit extends JFrame {
    private JPanel jp = new JPanel();
    private JLabel jl = new JLabel("deposit");

    public Deposit() {
        jp.add(jl);
        add(jp);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close this window only
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
