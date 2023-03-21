package com.teja.oops;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principal;
	BigDecimal interest;

	SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int years) {
		//		Formula = principal + principal * interest * years
		return principal.multiply(interest).multiply(new BigDecimal(years)).add(principal);
	}
}
