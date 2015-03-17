package week7;

import java.io.*;
public class main{

	public static void main(String[] args) throws IOException {
 
		n1 ds = new n1();
		ds.readFile("/Users/naisargee/Desktop/team6.ged");
		System.out.println("invalid data of birth before death");
		System.out.println("========================================");
		ds.birthBeforeDeath("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("invalid data of death before marriage");
		System.out.println("========================================");
		ds.DeathBeforeMarriage("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("fiding age of members.");
		System.out.println("========================================");
		ds.age("/Users/naisargee/Desktop/team6.ged");

		s1 ds1= new s1();
		ds1.readFile("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("invalid data of death before birth");
		System.out.println("========================================");
		ds1.deathbeforeBirth("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("finding person's birth place.");
		System.out.println("========================================");
		ds1.place("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("invalid data of marriage before birth");
		System.out.println("========================================");
		ds1.MarriageBeforeBirth("/Users/naisargee/Desktop/team6.ged");
		
		r1 ds2= new r1();
		ds2.readFile("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("fetching given name of every member in family");
		System.out.println("========================================");
		ds2.fatherMale("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("counting number of member in family");
		System.out.println("========================================");
		ds2.indicount("/Users/naisargee/Desktop/team6.ged");
	}
}
