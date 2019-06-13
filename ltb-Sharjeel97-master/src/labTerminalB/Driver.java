package labTerminalB;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Driver {
	/*
	 * TODO 1	10 Marks
	 * Write a regular express at line 10 so that you can remove all html tags from a given string
	 * after you write regular expression the out put should be
	 * The Good, the Bad, and the Ugly
	 * after completing each TODO task commit and push to remote repository with commit message
	 * 		"TODO 'TASK NUMBER' Complete" e.g. in this case "TODO 1 COMPLETED"
	 */
	public static void main(String[] args) {
		String input = "The <b>Good</b>, the <i>Bad</i>, and the <strong>Ugly</strong>";
		String regex = "<[^>]*>";
		String output = input.replaceAll(regex, "");
		System.out.println(output);
		
		
		Movie movie1=new Movie("Men in Black",0);
		Movie movie2=new Movie("Avengers End Game",1);
		Movie movie3=new Movie("Friendships",2);
		
		Customer customer=new Customer("Sharjeel");
		//Customer me2=new Customer("Allah Ditta");
		Rental rental1=new Rental(movie1,4);
		Rental rental2=new Rental(movie2,5);
		Rental rental3=new Rental(movie3,4);
		customer.addRental(rental1);
		customer.addRental(rental2);
		customer.addRental(rental3);
		System.out.println(customer.statement());
		//System.out.println(me2.statement());

	}
}
