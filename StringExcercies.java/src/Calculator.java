
public class Calculator {

public static int add(String line)
{int sum =0;
	
String s = line.replaceAll("\\s", "");
	String[] parts = s.split("\\+");
	for (int i=0;i<parts.length;i++)
	{
		sum += Integer.parseInt(parts[i]);
	}
	
	
	return sum; 	
}

	public static void main(String[] args) {
		
System.out.println(add(" 0 +31+4+ 81+9+10 "));

	}

}
