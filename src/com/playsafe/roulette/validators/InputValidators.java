package com.playsafe.roulette.validators;

public class InputValidators {

	public static boolean isValidNumber(String strNum) {
		try {
			int betNumber = Integer.valueOf(strNum);
			return true;
		} catch (Exception e) {
			System.out.println("======Invalid bet Number====");
			return false;
		}
	}

	public static boolean isValidBetCost(String strNum) {
		try {
			double betCost = Double.valueOf(strNum);
			return true;
		} catch (Exception e) {
			System.out.println("======Invalid bet Number====");
			return false;
		}
	}

}
