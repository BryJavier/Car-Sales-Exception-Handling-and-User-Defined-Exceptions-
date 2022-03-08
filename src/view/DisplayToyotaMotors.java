package view;
import java.text.DecimalFormat;

import model.*;

public class DisplayToyotaMotors {
	public void display(ToyotaMotors output) throws Exception {
		if(output == null) {
			System.out.println("INVALID CHOICE! TRY AGAIN.");
		}else {
			DecimalFormat df = new DecimalFormat("#.####"); //4 decimal places formatting for percentage
			
			if(output.isDiscountValid()) {
				System.out.println("\nYour discounted price is VALID. You only have a sales markup of " + df.format(output.computeDiscount()) + "%.");
				ToyotaMotors.validSales++;
				ToyotaMotors.netSales += output.computeNetSales();
				
			}else {
				ToyotaMotors.invalidSales++;
			}
			
			System.out.println("\nValid Sales: " + ToyotaMotors.validSales);
			System.out.println("Invalid Sales: " + ToyotaMotors.invalidSales);
		}
		
	}

}