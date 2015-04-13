package week7;

import java.io.*;
public class main{

	public static void main(String[] args) throws IOException {
 
		n1 ds = new n1();
		
		ds.readFile("/Users/naisargee/Desktop/team6.ged");
		System.out.println("Sprint 2 Naisargee");
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
		System.out.println(" ");
		System.out.println("Sprint 3 Naisargee ");
		
		System.out.println("divorce can not take place before marraige.Invalid data :");
		System.out.println("========================================");
		//ds.DivorceBeforeMarriage("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");

		System.out.println("Before birth one can not get divorced so invalid data:");
		System.out.println("========================================");
		//ds.divorceBeforeBirth("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("death after 150 year of birth");
		System.out.println("========================================");
		ds.deathafter150year("/Users/naisargee/Desktop/team6.ged");
		
		System.out.println("");
		System.out.println("members who got divorced on leap year:");
		System.out.println("========================================");
		ds.divorcedateleap("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("name and count of widows in family:");
		System.out.println("========================================");
		ds.widowcount("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("people who share same birth dates:");
		System.out.println("========================================");
		ds.IndividualSameBday("/Users/naisargee/Desktop/team6.ged");
		
		s1 ds1= new s1();
		ds1.readFile("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("Sprint 2 sandesh");
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
		System.out.println(" ");
		System.out.println("Sprint 3 sandesh");
		System.out.println(" ");
		System.out.println("people yet not born mean invalid birth year");
		System.out.println("========================================");
		ds1.unbornpeople("/Users/naisargee/Desktop/team6.ged");
		System.out.println(" ");
		System.out.println("people who took divorse after marraige");
		System.out.println("========================================");
		//ds1.DivorceAfterMarriage("/Users/naisargee/Desktop/team6.ged");
		System.out.println(" ");
		System.out.println("people whos divorse date is after death which is not relevant");
		System.out.println("========================================");
		ds1.divorceAfterDeath("/Users/naisargee/Desktop/team6.ged");
		System.out.println(" ");
		System.out.println("marraige on leap year:");
		System.out.println("========================================");
		ds1.weddingdateleap("/Users/naisargee/Desktop/team6.ged");
		System.out.println(" ");
		System.out.println("members who has same death date");
		System.out.println("========================================");
		ds1.IndividualSameDday("/Users/naisargee/Desktop/team6.ged");
		System.out.println(" ");
		System.out.println("members who born on leap year :");
		System.out.println("========================================");
		ds1.birthdatedateleap("/Users/naisargee/Desktop/team6.ged");
		
		r1 ds2= new r1();
		System.out.println(" ");
		System.out.println("Sprint 2 rakesh");
		//System.out.println(" ");
		ds2.readFile("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("fetching given name of every member in family");
		System.out.println("========================================");
		ds2.fatherMale("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("counting number of member in family");
		System.out.println("========================================");
		ds2.indicount("/Users/naisargee/Desktop/team6.ged");
		System.out.println(" ");
		System.out.println("Sprint 3 rakesh");
		System.out.println("");
		System.out.println("counting number of families in tree");
		System.out.println("========================================");
		ds2.famicount("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("counting number of dead people in family tree");
		System.out.println("========================================");
		ds2.deadpeople("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("finding divorsed dates");
		System.out.println("========================================");
		ds2.divorcecount("/Users/naisargee/Desktop/team6.ged");
		System.out.println("sprint 4");
		System.out.println(" ");
		System.out.println("finding dead husbands");
		System.out.println("========================================");
		ds2.widowercount("/Users/naisargee/Desktop/team6.ged");
		System.out.println("");
		System.out.println("finding child who are not adult");
		System.out.println("========================================");
		ds2.printAgeChild("/Users/naisargee/Desktop/team6.ged");
	}
}
