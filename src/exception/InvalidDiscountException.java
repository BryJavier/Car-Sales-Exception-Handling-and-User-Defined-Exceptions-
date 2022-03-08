package exception;

import java.text.DecimalFormat;

public class InvalidDiscountException extends Exception{
	private static final long serialVersionUID = 1L;
	
	private String INVALID_DISCOUNT_MESSAGE = "";
	DecimalFormat df = new DecimalFormat("#.####");
	
	public InvalidDiscountException(){
		INVALID_DISCOUNT_MESSAGE = "\nYour discount price is INVALID.";
	}
	
	public InvalidDiscountException(double discount){
		INVALID_DISCOUNT_MESSAGE = "\nYour discount price is INVALID. You have a sales "
				+ "discount of " + df.format(discount) + "%. You are suspended for 6 months."
				+ " All company benefits will be put on hold as well.";
	}
	
	public String getMessage() {
		return INVALID_DISCOUNT_MESSAGE;
	}
}
