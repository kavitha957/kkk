package Program;

import java.util.Scanner;

public class PalindromeorNot {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	int a,sum=0,temp;
	temp=i;
	while(i>0)
	{
		a=i%10;
		sum=sum*10+a;
		i=i/10;
	}
	if(sum==temp)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
	
}
}
