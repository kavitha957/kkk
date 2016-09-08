package Program;

import java.util.Scanner;

public class ArmstrongNum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	int a,cub=0,temp;
	temp=i;
	while(i>0)
	{
		a=i%10;
		i=i/10;
		cub=cub+(a*a*a);
		
	}
	if(cub==temp)
	{
		System.out.println("Armstrong num");
	}
	else
	{
		System.out.println("not a Armstrong:");
	}
	
}


}

