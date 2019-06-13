package labTerminalB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {
	Movie m1 = new Movie("Spancer", 0);
	Movie m2 = new Movie("Speed", 1);
	Movie m3 = new Movie("Men in Black", 0);
	Movie m4 = new Movie("Avengers End Game", 1);
	Customer me = new Customer("Nadir");
	Customer me2 = new Customer("Sharjeel");
	Rental r1 = new Rental(m1, 23);
	Rental r2 = new Rental(m2,4);
	Rental r3 = new Rental(m3, 4);
	Rental r4 = new Rental(m4,5);
	
	/**
	 * Test 1 Customer rented two movies one REGULAR and one NEW_RELEASE
	 */
	@Test
	public void testStatement1() {
		me.addRental(r1);
		me.addRental(r2);
		
		//fail("Not yet implemented");
		String output1 = "Rental Record for Nadir\r\n" + 
				"	Spancer	33.5\r\n" + 
				"	Speed	12.0";
		if(output1.equals(me.statement()))
		{
			assert true;
		}
	}
	@Test
	public void testStatement2() {
		me2.addRental(r3);
		me2.addRental(r4);
		//fail("Not yet implemented");
		String output1 = "Rental Record for Sharjeel\r\n" + 
				"	Men in Black	5.0\r\n" + 
				"	Avengers	15.0";
		if(output1.equals(me2.statement()))
		{
			assert true;
		}
	}
	@Test
	public void getting_Amount() {
		Movie m1 = new Movie("Men in Black", 0);
		Rental rental=new Rental(m1,4);
		double result = rental.amount_Calculation();
		if(result == 5) {
			assert true;
		}
	}
	@Test
	public void getting_Name() {
		Movie m1 = new Movie("Avengers End Game", 2);
		Rental rental=new Rental(m1,4);
		String result = rental.getMovie().getTitle();
		if(result.equals("Avengers End Game")) {
			assert true;
		}
	}
	@Test
	public void getting_PriceCode() {
		Movie m1 = new Movie("Avengers End Game", 1);
		Rental rental=new Rental(m1,4);
		int result = rental.getMovie().getPriceCode();
		if(result != 1) {
			assert false;
		}
	}
	/*
	 * TODO 2			10 Marks
	 * Provide at least two more test cases carefully chosen so that they satisfy our testing
	 * strategy basics i.e. input partition etc
	 */
	

}
