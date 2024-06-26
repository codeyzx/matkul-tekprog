package com.yahyaalfon.statement;

import com.yahyaalfon.Customer;
import com.yahyaalfon.Rental;

public class HtmlStatement extends Statement {

	public HtmlStatement(Customer customer) {
		super(customer);
	}

	@Override
	protected String detail(Rental rental) {
		return "<P>" + rental.getMovie().getTitle() + ": " + String.valueOf(rental.getCharge()) + "</P>\n";
	}

	@Override
	protected String footer() {
		return "<P>You owe <EM>" + String.valueOf(getCustomer().getTotalCharge()) + "</EM></P>\n"
				+ "<P>On this rental you earned <EM>" + String.valueOf(getCustomer().getTotalFrequentRenterPoints())
				+ "</EM> frequent renter points</P>";
	}

	@Override
	protected String header() {
		return "<P><H1>Rentals for <EM>" + getCustomer().getName() + "</EM></H1></P>\n";
	}

}
