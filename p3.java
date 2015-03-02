
import java.io.*;
public class p3 {

		public static String line = null;
		public static int indi;
		public static int male,female;
		
		public static void male(BufferedReader br) throws IOException
		{
			BufferedReader br1 = br;
			while ((line = br1.readLine()) != null)
			{
				if (  (line.contains("SEX") && line.contains("M")))
					male = male +1;	
				
			}
			System.out.println("Total number of male in family are :"+male);
		}

		public static void female(BufferedReader br) throws IOException
		{
			BufferedReader br2 = br;
			while ((line = br2.readLine()) != null)
			{
				if (  (line.contains("SEX") && line.contains("F")))
				{
					female = female +1;
				}
			}
			System.out.println("Total number of female in family are :"+female);
		}
		
		public static void countGender() throws IOException
		{
			if (male<female)
				System.out.println("In family number of female is grater than male");
			else
				System.out.println("In family number of male is grater than female");
		}
		
		
		public static void main(String[] args)
		{
		try
		{

			FileReader d1 = new FileReader("I:/gedcom file/sandesh-1-Mar-2015.ged");
			FileReader d2 = new FileReader("I:/gedcom file/sandesh-1-Mar-2015.ged");
			BufferedReader buf1 = new BufferedReader(d1);
			BufferedReader buf2 = new BufferedReader(d2);
			male(buf1);
			female(buf2);
			countGender();
		}
		catch(IOException ioe){

			System.out.println("Error is :"+ioe.getMessage());
		}
		}
}
		

	



