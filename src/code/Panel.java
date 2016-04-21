package code;

import javax.swing.*;
import java.awt.*;

/**
 * Created by josue on 21/04/16.
 */
public class Panel extends JFrame{

    private JPanel panel1;
    private JTextArea table;

    public Panel() throws HeadlessException {

        super("Premier League");
        setContentPane(panel1);

        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public void setTextArea(String text){
        table.setText(text);
    }
    public void apendTextArea(String text){
        table.append(text);
    }
}
