
package login_form;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author thomasongwae
 */
public class RegisterDataSavedToDatabase

{
    
    protected void RegisterDataSavedSucess()
            
    {
        
        
              //System.out.println("Records created successfully");
             
               JFrame frametwo = new JFrame();
               
               Image icon = Toolkit.getDefaultToolkit().getImage("/mnt/sda7/java_programming/login_form/src/login_form/top_corner_drawing.png");
              frametwo.setIconImage(icon);
              
              JOptionPane.showMessageDialog(frametwo, "Details Saved successfully");
                  
               //home_page page2 = new home_page();
               //page2.updatingjlist();
               
               frametwo.dispose();
        
        
    }
    
}
