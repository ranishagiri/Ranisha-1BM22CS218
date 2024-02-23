package see;
import cie.internals;
import java.util.Scanner;
public class external extends internals
{
	protected int mark[]=new int[5];
	protected int finalMarks[]=new int[5];
	public void getexternal()
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the external marks of course"+(i+1));
			mark[i]=s.nextInt();
		}
	}
	public void cal()
	{
		for(int i=0;i<5;i++)
		{
			
			finalMarks[i]=mark[i]/2+super.marks[i];
		}
	}
	public void displayFinal()
	{
		displaydetails();
		for(int i=0;i<5;i++)
		{
			System.out.println("course"+(i+1)+":"+finalMarks[i]);
			
		}
	}
}
	
