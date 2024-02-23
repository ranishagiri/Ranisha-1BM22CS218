package cie;
import java.util.Scanner;
public class students
{
	protected String usn=new String();
	protected String name=new String();
	protected int sem;
	public void getdetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the usn:");
		usn=s.next();
		System.out.println("enter the name:");
		name=s.next();
		System.out.println("enter the sem:");
		sem=s.nextInt();
	}
	public void displaydetails()
	{	
		System.out.println("name:"+name+" "+"usn:"+usn+" "+"sem:"+sem);
	}
}
