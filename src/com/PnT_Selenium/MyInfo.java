package com.PnT_Selenium;

/**
 * This program prints "Full Name" and "Address" on the console.
 * @author Papri Barua
 * 
 */

public class MyInfo {

	public static void main(String[] args) {
		
		String surName = "Barua";
		String givenName = "Papri";
		byte houseNumber = 7;
		String streetAddress = "ABC Lane";
		String city = "XYZ Township";
		String state = "NJ";
		String zipcode = "01010";
		
		System.out.append("Full Official Name: " + surName + ", " + givenName);
        System.out.append("\n\nAddress Is As Below:\n" + houseNumber + " " + streetAddress + "\n" + city + "\n" + state + " " + zipcode);
      
	}
}
