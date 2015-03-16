package week7;

public class r1 extends readFile
{
	public void indicount(String file) 
	{
	
		int indi = members.size();
		System.out.println("Total number of Individual are : "+indi);
	}
	public void fatherMale(String file)
	{
		
		for(int i=0; i < members.size(); i++)
		{
			 member indi = members.get(i);
			 String name=indi.getGivenName();
			 System.out.println(name);
		}
	}
}
