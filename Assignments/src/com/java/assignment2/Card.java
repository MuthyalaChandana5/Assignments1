package com.java.assignment2;

public abstract class Card {
	
    abstract void credit() ;
}

class AtmCard extends Card{
		
	void credit() {
			System.out.println("Amount credited");
	}
public static void main(String args[]) {
	Card c =new AtmCard();
		c.credit(); 
		// Crediting the amount is shown but what are the background process for crediting is not shown
	
}
}
