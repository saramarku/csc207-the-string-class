import java.util.Scanner;


public class ForgivingPrompt {
public static boolean forgivingPrompt (String question){
	
	
	System.out.println(question);
	Scanner in = new Scanner(System.in);
	String answer = in.nextLine();

	
	if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("yep"))
	{
		return true;
	}
	if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("nope"))
	{
		return false;
	}
	else
		return (forgivingPrompt(question));
}

	public static void main(String[] args) {
		String question =  "Do you like CSC207?";
System.out.println(forgivingPrompt(question));

	}

}
