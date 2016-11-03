

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Crackme
{

    public Crackme()
    {
    }

    public static void main(String args[])
    {
        (args = new JFrame("Crackme - Code by CRY971C")).setPreferredSize(new Dimension(300, 300));
        args.setResizable(false);
        args.setDefaultCloseOperation(3);
        args.getContentPane().add(new c(args));
        args.pack();
        args.setVisible(true);
    }
}