package Program;

import java.util.Scanner;

public class PowofNum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	
	System.out.println("enter the num:");
	int i=s.nextInt();
	 System.out.println("enter pow of a num:");
	int j=s.nextInt();
	double k=Math.pow(i, j);
	System.out.println("number"+" "+k);
}
}
