/** 
 * Computer Science 1 - James Mitchell - Exam 3B - RetailItem Class - 6:4 TEST PROGRAM FILE
 * May 3, 2020
 * 
 * This is the Test Program file for the RealItemClassJamesM.java file. 
 * 
 * @author James Mitchell
 * @version 0.1
*/

import javax.swing.JOptionPane; // Needed for Message Box
import javax.swing.JTextArea;	// Needed for Area for text inside Message Box

public class RetailItemTestJamesM 
{
	
    public static void main(String[] args) 
    {
    	// Variables
    	String D1, D2, D3, message;
	    int U1, U2, U3;
	    double P1, P2, P3;
	        
	    /**
	     *  New Items to create to export.
	     *  Each Item contains - Description, Units, Price in that order.
	     */
	    RetailItemJamesM item1 = new RetailItemJamesM("Jacket",12,59.95);
	    RetailItemJamesM item2 = new RetailItemJamesM("Designer Jeans",40,34.95);
	    RetailItemJamesM item3 = new RetailItemJamesM("Shirt",20,24.95);
	        
	    // Call get methods from RetailItemJamesM Class to set Item 1
	    D1 = item1.getDescription();
	    U1 = item1.getUnitsOnHand();
	    P1 = item1.getPrice();
	    
	    // Call get methods from RetailItemJamesM Class to set Item 2
	    D2 = item2.getDescription();
	    U2 = item2.getUnitsOnHand();
	    P2 = item2.getPrice();
	    
	    // Call get methods from RetailItemJamesM Class to set Item 3
	    D3 = item3.getDescription();
	    U3 = item3.getUnitsOnHand();
	    P3 = item3.getPrice();
	    
	    // Set Message string to the following for export into JOptionPane Message Box
	    message = "\tDescription\t\tUnits on Hand\t\tPrice\n" +
				"\t------------------------------------------------------" +
				"-------------------------------------------\n" +
				"Item #1\t"+ D1 +"\t\t"+ U1 +"\t\t"+ P1 + "\n" +
				"Item #2\t"+ D2 +"\t"+ U2 +"\t\t"+ P2 + "\n" +
				"Item #3\t"+ D3 +"\t\t"+ U3 +"\t\t"+ P3 + "\n";
	    
	    // Show Message Box with Item List.
	    JOptionPane.showMessageDialog(null, new JTextArea(message));
	        
	        System.exit(0); // Exit Program
    }
}
