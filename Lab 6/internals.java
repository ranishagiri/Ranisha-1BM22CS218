package cie;
import java.util.Scanner;
public class internals extends students
{
	protected int marks[]=new int[5];
	public void getinternals()
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the internal marks of course"+(i+1));
			marks[i]=s.nextInt();
		}
	}
}
