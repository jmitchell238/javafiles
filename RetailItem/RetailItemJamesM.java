/** 
 * Computer Science 1 - James Mitchell - Exam 3B - RetailItem Class - 6:4
 * May 3, 2020
 * 
 * Write a class named RetailItem that holds data about an item in a retail store. The class
 * should have the following fields:
 * 
 * 	- 	description. The description field references a String object that holds a brief 
 * 		description of the item.
 * 	-	unitsOnHand. The unitsOnHand field is an int variable that holds the number of units 
 * 		currently in inventory.
 * 	-	price. The price field is a double that holds the item's retail price.
 * 
 * Write a constructor that accepts arguments for each field, appropriate mutator methods that
 * store values in these fields, and accessor methods that return the values in these fields. Once
 * you have written the class, write a separate program that creates three RetailItem objects
 * and stores the following data in them:
 * 
 * 					Description		Units on Hand		Price
 * 		Item #1		Jacket			12					59.95
 * 		Item #2		Designer Jeans	40					34.95
 * 		Item #3		Shirt			20					24.95
 * 
 * 
 * 
 * 
 * @author James Mitchell
 * @version 0.1
*/

public class RetailItemJamesM 
{
	// Fields
    private String description;   // description field
    private int unitsOnHand;   // unitsOnHand field
    private double price;   // price field
    
    /**
     * Constructor
     * @param description references a String object tat holds a brief description of the item
     * @param unitsOnHand field is an int variable that holds the number of units 
     * 		  currently in inventory.
     * @param tst3 price field is a double that holds the item's retail price.
     */
	
	public RetailItemJamesM(String d, int u, double p)
	{
		description = d;
		unitsOnHand = u;
		price = p;
	}

	/**
    * The setDescription method sets the description of the item.
    * @param d - The description to store in description.
    */
	public void setDescription(String d)
	{
		description = d;
	}
	
	/**
	* The setUnitsOnHand method sets the number of units of the item available.
	* @param u - The amount of units to store in unitsOnHand.
	*/
	public void setUnitsOnHand(int u)
	{
		unitsOnHand = u;
	}
	
	/**
	* The setPrice method sets the price for the item.
	* @param p - The Price of item to be set in price.
	*/
	public void setPrice(Double p)
	{
		price = p;
	}
	
	/**
	* getDescription method
	* @return The Description of the item.
	*/
	public String getDescription()
	{
		return description;
	}
	
	/**
	* getUnitsOnHand method
	* @return The number of units of item available.
	*/
	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}
	
	/**
	* getPrice method
	* @return The Price of the Item.
	*/
	public double getPrice()
	{
		return price;
	}
	
}
