import java.util.Scanner;


public class Comma_separated {

	public static String parseName(String s){
		String[] parts = s. split(",");
		String first = parts[1];
		String middle = parts[2];
		String last = parts[0];
		
		String name = first + " " + middle + " " + last;
		return name;
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Give your last first and middle name");
		String answer = in.nextLine();
System.out.println(parseName(answer));
	}

}
