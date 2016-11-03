

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public final class c extends JPanel
{

    public c(JFrame jframe)
    {
        setLayout(new GridLayout(2, 1));
        a_javax_swing_ImageIcon_fld = new ImageIcon(getClass().getResource("images.jpg"));
        a_javax_swing_JLabel_fld = new JLabel(a_javax_swing_ImageIcon_fld);
        b_javax_swing_JLabel_fld = new JLabel("Enter Name:  ");
        c_javax_swing_JLabel_fld = new JLabel("Enter Serial:  ");
        b_javax_swing_JTextField_fld = new JTextField(12);
        a_javax_swing_JTextField_fld = new JTextField(12);
        button = new JButton("VERIFY");
        a_javax_swing_JPanel_fld = new JPanel();
        a_javax_swing_JPanel_fld.setPreferredSize(new Dimension(300, 150));
        button.setPreferredSize(new Dimension(300, 90));
        button.addActionListener(new a(this, jframe));
        a_javax_swing_JPanel_fld.add(b_javax_swing_JLabel_fld);
        a_javax_swing_JPanel_fld.add(a_javax_swing_JTextField_fld);
        a_javax_swing_JPanel_fld.add(c_javax_swing_JLabel_fld);
        a_javax_swing_JPanel_fld.add(b_javax_swing_JTextField_fld);
        a_javax_swing_JPanel_fld.add(button);
        add(a_javax_swing_JLabel_fld);
        add(a_javax_swing_JPanel_fld);
    }

    private JPanel a_javax_swing_JPanel_fld;
    private JLabel a_javax_swing_JLabel_fld;
    private JLabel b_javax_swing_JLabel_fld;
    private JLabel c_javax_swing_JLabel_fld;
    private ImageIcon a_javax_swing_ImageIcon_fld;
    JTextField a_javax_swing_JTextField_fld;
    JTextField b_javax_swing_JTextField_fld;
    private JButton button;
    String b_java_lang_String_fld;
    String c_java_lang_String_fld;
}