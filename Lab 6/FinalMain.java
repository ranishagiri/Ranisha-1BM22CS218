import see.external;
class finalMain
{
	public static void main(String args[])
	{
		int no=2;
		external e[]=new external[no];
		for(int i=0;i<no;i++)
		{
			e[i]=new external();
			e[i].getdetails();
			System.out.println("enter cie marks");
			e[i].getinternals();
			System.out.println("enter see marks");
			e[i].getexternal();
		}
		System.out.println("displaying details:");
		for(int i=0;i<no;i++)
		{
			e[i].cal();
			e[i].displayFinal();
		}
	}
}			
			
