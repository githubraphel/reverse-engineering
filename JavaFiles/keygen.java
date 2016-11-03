package pack;

import java.awt.*;        
import java.awt.event.*;  

import javax.swing.JOptionPane;

 
@SuppressWarnings("serial")
public class keygen extends Frame implements ActionListener {
   private Label lbl;    
   private TextField tf;
   
   
  
   
   String s="";
   
   
  
  
  public static final String NL = System.getProperty("line.separator"); 
   
   
   private Button GetButton;  

 
   /** Constructor to setup GUI components and event handling */
   public keygen () {
      setLayout(new FlowLayout());
        
 
      lbl = new Label("Enter String");  
      add(lbl);  
 
      tf = new TextField("String", 15); 
      add(tf);                    
 
      GetButton = new Button("click to generate key");  
      add(GetButton); 
      
    
 
      GetButton.addActionListener(this);
      
      
         
 
      setTitle("KEY GENERATOR"); 
      setSize(200, 250); 
      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
      this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);// "super" Frame sets initial window size
 
       setVisible(true);        
      
   }
 
   public static void main(String[] args) {
	   
      // invoking the constructor by object creation
      @SuppressWarnings("unused")
	keygen key = new keygen();
      
      
   }
 
   
   public void actionPerformed(ActionEvent evt) {
      
      b bObj = new b();
            
      
      String name = tf.getText();
      bObj.key = Integer.toString(name.length() * 1337);
  	 bObj.a_java_lang_String_fld = "";
       for(int i = 0; i < bObj.key.length(); i++)
       {
           bObj.a_java_lang_String_fld = bObj.a_java_lang_String_fld.concat(bObj.
          		 a_java_lang_String_array1d_fld[Integer.
                      parseInt(bObj.key.substring(i, i + 1))]);
       }
       JOptionPane.showMessageDialog(null, "Key for "+ name + ":" +bObj.a_java_lang_String_fld, "KEY ", JOptionPane.INFORMATION_MESSAGE);
       
       
       
  }         
}
