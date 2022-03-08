package model;

import exception.InvalidDiscountException;

public abstract class ToyotaMotors {
	protected int requiredPercentDiscount = 12;
	public static int validSales = 0;
	public static int invalidSales = 0;
	public static double netSales = 0;
	
	
	public abstract boolean isDiscountValid() throws InvalidDiscountException;
	public abstract double computeDiscount();
	public abstract double computeNetSales();
}
