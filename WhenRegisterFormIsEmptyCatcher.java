
package login_form;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author thomasongwae
 */
public class WhenRegisterFormIsEmptyCatcher 

{
    protected void WhenRegisterFormIsEmpty()
    {
        
            
            JFrame frameone = new JFrame();
       
        
        
        
             //changing the jframe icon 
               Image icon = Toolkit.getDefaultToolkit().getImage("/mnt/sda7/java_programming/login_form/src/login_form/top_corner_drawing.png");
              frameone.setIconImage(icon);
        
            //set default close option
             JOptionPane.showMessageDialog(frameone, "Please enter the details first");
             
    }
    
}
