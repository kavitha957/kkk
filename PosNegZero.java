package Program;

import java.util.Scanner;

public class PosNegZero {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	if(i>0)
	{
		System.out.println("positive number");
	}
	else if(i<0)
	{
		System.out.println("negative number");
	}
	else
	{
		System.out.println("zero");
	}
}
}
