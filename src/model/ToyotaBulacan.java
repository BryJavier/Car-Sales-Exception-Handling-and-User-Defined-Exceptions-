package model;

import exception.InvalidDiscountException;

public class ToyotaBulacan extends ToyotaMotors {

	private double retailPrice = 0;
	private double discountedPrice = 0;
	private String customerName;
	private String salesAgent;
	private String itemName;

	public ToyotaBulacan() {
		System.out.println("\nWelcome to Toyota Motors Bulacan!");
	}
	
	@Override
	public boolean isDiscountValid() {
		try {
			if(computeDiscount() > 12) {
				throw new InvalidDiscountException(computeDiscount());
			}
		}catch(InvalidDiscountException ide) {
			System.err.println(ide.getMessage());
			return false;
		}catch(Exception e) {
			System.err.println("An unknown error occured, try again.");
		}
		return true;
	}

	@Override
	public double computeDiscount() {
		return ((retailPrice - discountedPrice) / retailPrice) * 100;
	}

	@Override
	public double computeNetSales() {
		return retailPrice * (computeDiscount() / 100);
	}
	
	
	//Setters and Getters
	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getSalesAgent() {
		return salesAgent;
	}

	public void setSalesAgent(String salesAgent) {
		this.salesAgent = salesAgent;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	
	


}
