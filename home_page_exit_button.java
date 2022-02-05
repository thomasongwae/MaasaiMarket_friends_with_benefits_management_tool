
package login_form;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author thomasongwae
 */
public class home_page_exit_button
{
    protected void  exit_home_button()
    {
        
        
         JFrame frameone = new JFrame();
       
        
        
        
        //changing the jframe icon 
        Image icon = Toolkit.getDefaultToolkit().getImage("/mnt/sda7/java_programming/login_form/src/login_form/top_corner_drawing.png");
        frameone.setIconImage(icon);
        
        //set default close option
        
        
        
        
        int options = JOptionPane.showConfirmDialog(frameone, "Warning Do you Want to Exit","Exiting",JOptionPane.YES_NO_OPTION);
        
       
         
        if (options == JOptionPane.YES_OPTION)
                {
                    
                   //Exit the Application
                    
                     
                    System.exit(0);
                   
                    System.out.print("Application Exit was Successfully \n");
                     
                }
        
        
        if (options == JOptionPane.NO_OPTION)
       
                {
                    
                     System.out.println("Operation Canceled by the User");
                    
                }
        else
                {
                    
                    System.out.println("The User Did not click any Button");
            
                }
        
    }
        
}
