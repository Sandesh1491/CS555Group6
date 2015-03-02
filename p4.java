
import java.io.*;
public class p4 {
	
	public static boolean line1 ;
	public static String line;
	public static void checkEmail() throws IOException
	{

		FileReader f = new FileReader("I:/gedcom file/sandesh-1-Mar-2015.ged");
		BufferedReader r = new BufferedReader(f);
		String p;
		
		while((p = r.readLine())!=null)
		{
			if(p.contains("EMAIL"))
					{
					String x= p;
					if(x.contains("@") && x.contains("."))
					{
						System.out.println(x+" is a Valid email address");
					}
					else
					{
						System.out.println(x+"is an Invalid email address");
					}
					}
		}
	}
	
	
	
	public static void checkNumb() throws IOException
	{
		FileReader f = new FileReader("I:/gedcom file/sandesh-1-Mar-2015.ged");
		BufferedReader r = new BufferedReader(f);
		String p;
		
		while((p=r.readLine())!=null)
		{
			if(p.contains("PHON"))
			{
				String numb=p;
				String numb1=numb.substring(7);
				if(((numb1.length())!=10))
				{
					System.out.println(numb+" is an invalid phone number");
				}
				else
				{
					System.out.println(numb+" ia a valid number");
				}
			
			}
		}
	}
	
	public static void main(String[] args)
	{
	try
	{
		checkEmail();
		System.out.println("==============================================");
		checkNumb();	
	}
	catch(IOException ioe){

		System.out.println("Error is :"+ioe.getMessage());
	}
	}
}
