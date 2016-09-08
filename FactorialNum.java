package Program;

import java.util.Scanner;

public class FactorialNum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	int a,f=1;
	for( a=1;a<=i;a++)
	{
		f=f*a;
		
	}
	System.out.println(f);
	
}
}
