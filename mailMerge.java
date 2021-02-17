import java.util.Scanner;

public class mailMerge {
	public static void main(String[] args){
		Scanner in = new Scanner(System. in);
		//This code illustrates creation of variables
		// String promptText2 = "Please enter your last name: ";
		// String promptText3 = "Please enter your house number: ";
		// String promptText4 = "Please enter your street: ";
		// String promptText5 = "Is this address correct? ";
		
		
		String firstname = "Please enter your first name: ";
		System.out.println(firstname);
		String Firstname = in.nextLine();
		
		String lastname = "Please enter your last name: ";
		System.out.println(lastname);
		String Lastname = in.nextLine();
		
		String housenumber = "Please enter your house number: ";
		System.out.println(housenumber);
		String Housenumber = in.nextLine();

		String street = "Please enter your street: ";
		System.out.println(street);
		String Sname = in.nextLine();
		
		// New ReplaceText variables
		String replaceText1 = "Dear <firstName> <lastName>,";
		String replaceText2 = "Please confirm that your address is <houseNumber> <street>.";
		String replaceText3 = "Your answer is: <yORn> Goodbye!";

		replaceText1 = replaceText1.replace("<firstName>", Firstname);// replaces all occurrences
		replaceText1 = replaceText1.replace("<lastName>", Lastname);
		System.out.println(replaceText1);
		replaceText1 = in.nextLine();
		
		replaceText2 = replaceText2.replace("<housenumber>", Housenumber);
		replaceText2 = replaceText2.replace("<street>", Sname);// replaces all occurrences
		System.out.println(replaceText2);
		replaceText2 = in.nextLine();
		
		String address = "Is this address correct? ";
		System.out.println(address);
		String address1 = in.nextLine();

		replaceText3 = replaceText3.replace("yORn", address1);
		replaceText3 = "Your answer is: <yORn> Goodbye!";
		System.out.println(replaceText3);
	}
}
