package ePortfolio;
/**
 * Contains private variables, methods related to accessing/mutating said variables, method toString and some custom methods 
 */
public class MutualFund extends Investement{

	//TODO accessible from any file, call main

	//constructors
	/**
	 * Parameter-less constructor. sets string values to "NaN" and int/float values to 0
	 */
	public MutualFund(){
		super();
	}
	/**
	 * takes user input for all values, and creates MutualFund object using them. assume no previous info was given. calculates bookValue as well
	 * @param symbol		user input. will be used to set MutualFund.symbol
	 * @param name			user input. will be used to set MutualFund.name
	 * @param quantity		user input. will be used to set MutualFund.quanity. will be used to calculate bookValue
	 * @param price			user input. will be used to set MutualFund.price. will be used to calculate bookValue
	 */
	public MutualFund(String name, String symbol, int quantity, float price) {
		super(name, symbol, quantity, price);
		setBookValue(quantity, price);
	}
	/**
	 * constructor. uses predetrmined bookValue as well
	 */
	public MutualFund(String name, String symbol, int quantity, float price, float bookValue) {
		super(name, symbol, quantity, price, bookValue);
	}

	/**
	 * toString. adds type of investement as well as everything else.
	 */
	public String toString(){
		return "Type: Mutual Fund\n" +  super.toString();
	}
	/**
	 * toFile. formatted for FileIO. adds type of investement as well
	 */
	@Override
	public String toFile(){
		return "type = \"mutualfund\"\n" + super.toFile();
	}
	/**
	 * get gain is calculated differently. need to override
	 */
	@Override
	public float getGain(){
		return super.getGain() - 45;
	}
}
