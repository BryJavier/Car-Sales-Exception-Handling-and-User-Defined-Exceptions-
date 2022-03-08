package controller;
import java.util.Scanner;

import model.*;
import view.DisplayToyotaMotors;

public class AccessToyotaMotors {
	
	
	public static ToyotaMotors getInfo() {
		Scanner userIn = new Scanner(System.in);
		ToyotaMotors agent = null;
		ToyotaQC qcAgent = null;
		ToyotaManila manilaAgent = null;
		ToyotaBulacan bulacanAgent = null;
		
		String customerName;
		String salesAgent;
		String itemName;
		double retailPrice = 0;
		double discountedPrice = 0;
		
		String choice;
		
		System.out.println("\nWelcome to Toyota Motors Philippines!");
		System.out.println("\nPlease choose your branch");
		System.out.println("1. Toyota Motors Quezon City");
		System.out.println("2. Toyota Motors Manila");
		System.out.println("3. Toyota Motors Bulacan");
		System.out.print("\nEnter your choice: ");
		choice = userIn.next();
		userIn.nextLine();

		switch (choice) {
		case "1":
			qcAgent = new ToyotaQC();

			System.out.print("\nEnter Customer Name: ");
			customerName = userIn.nextLine();
			qcAgent.setCustomerName(customerName);

			System.out.print("Enter Sales Agent: ");
			salesAgent = userIn.nextLine();
			qcAgent.setSalesAgent(salesAgent);

			System.out.print("Enter Item Name: ");
			itemName = userIn.nextLine();
			qcAgent.setItemName(itemName);

			System.out.print("Enter Sales Retail Price: ");
			retailPrice = userIn.nextDouble();
			qcAgent.setRetailPrice(retailPrice);

			System.out.print("Enter Target Sales Price: ");
			discountedPrice = userIn.nextDouble();
			qcAgent.setDiscountedPrice(discountedPrice);

			agent = qcAgent;
			userIn.nextLine();
			break;

		case "2":
			manilaAgent = new ToyotaManila();

			System.out.print("\nEnter Customer Name: ");
			customerName = userIn.nextLine();
			manilaAgent.setCustomerName(customerName);

			System.out.print("Enter Sales Agent: ");
			salesAgent = userIn.nextLine();
			manilaAgent.setSalesAgent(salesAgent);

			System.out.print("Enter Item Name: ");
			itemName = userIn.nextLine();
			manilaAgent.setItemName(itemName);

			System.out.print("Enter Sales Retail Price: ");
			retailPrice = userIn.nextDouble();
			manilaAgent.setRetailPrice(retailPrice);

			System.out.print("Enter Target Sales Price: ");
			discountedPrice = userIn.nextDouble();
			manilaAgent.setDiscountedPrice(discountedPrice);

			agent = manilaAgent;
			userIn.nextLine();
			break;

		case "3":
			bulacanAgent = new ToyotaBulacan();
			System.out.print("\nEnter Customer Name: ");
			customerName = userIn.nextLine();
			bulacanAgent.setCustomerName(customerName);

			System.out.print("Enter Sales Agent: ");
			salesAgent = userIn.nextLine();
			bulacanAgent.setSalesAgent(salesAgent);

			System.out.print("Enter Item Name: ");
			itemName = userIn.nextLine();
			bulacanAgent.setItemName(itemName);

			System.out.print("Enter Sales Retail Price: ");
			retailPrice = userIn.nextDouble();
			bulacanAgent.setRetailPrice(retailPrice);

			System.out.print("Enter Target Sales Price: ");
			discountedPrice = userIn.nextDouble();
			bulacanAgent.setDiscountedPrice(discountedPrice);

			agent = bulacanAgent;
			userIn.nextLine();
			break;

		default:
			break;
		}
		
		return agent;
	}
	
	public static void main(String[] args) throws Exception {
		DisplayToyotaMotors output = new DisplayToyotaMotors();
		Scanner userIn = new Scanner(System.in);
		String currency = "PHP ";
		
		String choice = "Y";
		
		while(choice.equals("Y")) {
		
			output.display(getInfo());
			
			System.out.print("\nDo you want to continue? [Y/N]: ");
			choice = userIn.nextLine();
			choice = choice.toUpperCase();
			
			while(!choice.equals("Y") && !choice.equals("N")) {
				System.out.println("INVALID CHOICE! TRY AGAIN.");
				System.out.print("\nDo you want to continue? [Y/N]:");
				choice = userIn.nextLine();
				choice = choice.toUpperCase();
			}
		}
		
		System.out.println("\nTotal net sales: " + currency +ToyotaMotors.netSales);

		userIn.close();
		
	}

}
