package switchstatement;

/**
 * AWT Sample application
 *
 * @author Eric Schenck
 * @version 1.00 12/09/24
 */
import java.text.NumberFormat;
import javax.swing.JOptionPane;


public class SwitchStatement {
    
    public static void main(String[] args) {
        
        String firstInput = JOptionPane.showInputDialog(null, "Please enter the"
         + " number of your corresponding vehicle:\n\n1.) Passenger car\n2.)"
         + " Bus\n3.) Truck\n4.) Dump Truck\n5.) Monster Truck\n6.) Hybrid");
         
         int vehicleType = Integer.parseInt(firstInput);
         
         double toll;
         
         //switch(Controlling expression)
         switch(vehicleType)
         {
          case 1:
          case 6:
           JOptionPane.showMessageDialog(null, "You selected a "
            + "passenger car.");
           toll = 1.5;
           break;//break will tell the cpu to stop and go to the 
           //end of the block, if there is no break the cpu will 
           //process further code untill it hits a break
           
          case 2:
           JOptionPane.showMessageDialog(null, "You selected a "
            + "bus.");
           toll = 2.5;
           break;
           
          case 3:
          case 4:
          case 5: 
           JOptionPane.showMessageDialog(null, "You selected a "
            + "Truck.");
           toll = 4.5;
           break;
           
           ///default will catch any value not found by your case 
           //statements.
          default:
           JOptionPane.showMessageDialog(null, "Unknown vehicle.");
           toll = 5;
           break;
         }
         
         NumberFormat formatter = NumberFormat.getCurrencyInstance();
         
         JOptionPane.showMessageDialog(null, "Your toll is equal to "
          + formatter.format(toll));
    }
}