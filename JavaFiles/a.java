

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public final class a
    implements ActionListener
{

    public a(c c1, JFrame jframe)
    {
        a_c_fld = c1;
        super();
        a_javax_swing_JFrame_fld = jframe;
    }

    public final void actionPerformed(ActionEvent actionevent)
    {
        actionevent = new b();
        a_c_fld.b_java_lang_String_fld = a_c_fld.a.getText();
        a_c_fld.c = a_c_fld.b_javax_swing_JTextField_fld.getText();
        a_c_fld.c;
        String s = a_c_fld.b_java_lang_String_fld;
        actionevent = actionevent;
        actionevent.key = Integer.toString(s.length() * 1337);
        actionevent.a_java_lang_String_fld = "";
        for(int i = 0; i <= 25; i++)
        {
            if(i == ((b) (actionevent)).key.length())
                break;
            actionevent.a_java_lang_String_fld = ((b) (actionevent)).a_java_lang_String_fld.concat(((b) (actionevent)).a_java_lang_String_array1d_fld[Integer.parseInt(((b) (actionevent)).key.substring(i, i + 1))]);
        }

        break MISSING_BLOCK_LABEL_139;
_L1:
        ((b) (actionevent)).a_java_lang_String_fld;
        break MISSING_BLOCK_LABEL_146;
        JFrame jframe;
        jframe = a_javax_swing_JFrame_fld;
        String s1 = ((b) (actionevent)).a_java_lang_String_fld;
          goto _L1
        equals();
        JVM INSTR ifeq 162;
           goto _L2 _L3
_L2:
        break MISSING_BLOCK_LABEL_152;
_L3:
        break MISSING_BLOCK_LABEL_162;
        JOptionPane.showMessageDialog(jframe, "Good job, now write a guide and code a keygen!!", "YES!!!", -1);
        return;
        JOptionPane.showMessageDialog(jframe, "Nope, try again!", "Try Again", 0);
        return;
    }

    private JFrame a_javax_swing_JFrame_fld;
    private c a_c_fld;
}