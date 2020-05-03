package com.meritamerica.assignment5.models;

public class ExceedsAvailableBalanceException extends Exception {
	public ExceedsAvailableBalanceException(String message) {
		super(message);
	}
}
