package Program;

import java.util.Scanner;

public class LeaporNot {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	if(i%4==0)
	{
		System.out.println("Leap year");
	}
	else
	{
		System.out.println("not a leap year");
	}
}
}
