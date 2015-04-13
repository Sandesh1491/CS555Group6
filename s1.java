package week7;

import java.util.ArrayList;
import java.util.List;

public class s1 extends readFile
{
	//Sprint2 userstory1 sandesh
	public void deathbeforeBirth(String file)
	{
		for(int i=0; i < members.size(); i++)
		{
			member indi = members.get(i);
			String dDate = indi.getDeathDate();
			if(dDate != null)
			{
				String bYear = indi.getBirthDate();
				String dYear[] = dDate.split(" ");
				String year[] = bYear.split(" ");
				if (Integer.parseInt(dYear[2]) > Integer.parseInt(year[2]))
				{
					System.out.println("Birth cannot happen before death for " + indi.getGivenName() +" "+ indi.getSurName());
				}
			}
		}
	}
	
	//sprint2 userstory2 sandesh
	public void place(String file)
	{
		for(int i=0; i < members.size(); i++)
		{
			member indi = members.get(i);
			String bPlace = indi.getPLAC();
			if(bPlace != null)
			{
				System.out.println("birth place for  " + indi.getGivenName() +" "+ indi.getSurName() + "is" + indi.getPLAC());
			}
		}
	}
	//sprint2 userstory3 sandesh
	public void MarriageBeforeBirth(String file)
	{
		for(int i=0; i < members.size(); i++)
		{
			for(int j=0;j<families.size();j++)
			{
				member indi = members.get(i);
				group_family fami = families.get(j);
				String bDate= indi.getBirthDate();
				String mDate= fami.getWeddingDate();
				if(bDate != null && mDate != null)
				{
					String bYear[] = bDate.split(" ");
					String year[] = mDate.split(" ");
					if (Integer.parseInt(bYear[2]) > Integer.parseInt(year[2]))
					{
						System.out.println("Marriage can't happen before birth for " + indi.getGivenName()+" "+ indi.getSurName());
					break;
					}
					//if(i < members.size())
					//{
					//}	
				}	
			}
		}
	}
	
	//sprint3 userstory1 sandesh
	
	public void unbornpeople(String file)
	{
		//System.out.println(members.size());
		for(int i=0; i < members.size(); i++)
		{
			 member indi = members.get(i);
			 String bYear = indi.getBirthDate();
			 String year[] = bYear.split(" ");
			 int x = Integer.parseInt(year[2]);
			 if(x>2015)
			 {
			 System.out.println("Person is not yet born " +indi.getGivenName() +" "+ indi.getSurName());			 
		}
	}
	}
	
	//sprint3 userstory2 sandesh
	public void DivorceAfterMarriage(String file){
		for(int i=0; i < members.size(); i++)
		{
			for(int j=0;j<families.size();j++)
			{
		 member indi = members.get(i);
		 group_family fami = families.get(j);
		 
		
	    String divorcedate = fami.getDivorceDate();
		String weddingdate= fami.getWeddingDate();
		if(divorcedate != null && weddingdate!=null)
		{
		String divorceyear[] = divorcedate.split(" ");
		String year[] = weddingdate.split(" ");
		if (Integer.parseInt(divorceyear[2]) > Integer.parseInt(year[2]))
		{
			System.out.println("Divorce after Wedding for "+ indi.getGivenName()+" " +indi.getSurName());	
		}
		}
		i+=1;
		j+=1;
	}					
	}
	}	
	
	//sprint3 userstory3 sandesh
	public void divorceAfterDeath(String file)
	{
		for(int i=0; i < members.size(); i++)
		{
			for(int j=0;j<families.size();j++)
			{
		 member indi = members.get(i);
		 group_family fami = families.get(j);
		 String deathDate = indi.getDeathDate();
		 String divorceDate = fami.getDivorceDate();
		// System.out.println(divorceDate);
		 if(deathDate != null && divorceDate!=null){
			 String deathyear[] = deathDate.split(" ");
			 String year[] = divorceDate.split(" ");
		 if (Integer.parseInt(deathyear[2]) < Integer.parseInt(year[2]))
		 {
		 System.out.println("Divorce cannot happen after death" +" "+ indi.getGivenName()+" "+ indi.getSurName());
		 i+=1;
			j+=1;
		
		 }
		}
		}
		}
		}
	
	//Sprint4 userstory1 sandesh
	
	public void weddingdateleap(String file) throws NumberFormatException
	{
	try
	{
			for(int j=0;j<families.size();j++)
			{
				member indi = members.get(j);
				group_family fami = families.get(j);	 
				String weddate = fami.getWeddingDate();
				
				if(weddate!=null)
				{
			double d =Double.parseDouble( weddate.substring(6));
		
			if ((d % 4 == 0 && d % 100 != 0) ||d % 400 == 0)
			{
				System.out.println("The marraige Dates on leap year are:" + " "
						+ fami.getWeddingDate() + ", " + indi.getGivenName()+ " " + indi.getSurName());	
			}	
	    }
	}
	}
		catch (NumberFormatException n)
		{
			System.out.println("error");
		}
	}

	//Sprint 4 userstory 2 sandesh

	public void IndividualSameDday(String file) {

		List<String> date = new ArrayList<String>();

		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getDeathDate() != null) {
				List<String> n1 = new ArrayList<String>();
				n1.add(members.get(i).getDeathDate());
				n1.add(members.get(i).getGivenName());
				if (!date.contains(n1.get(0))) {
					int flag = 0;
					for (int j = i + 1; j < members.size(); j++)
						if (members.get(j).getDeathDate() != null)
							if (members.get(j).getDeathDate()
									.equals(n1.get(0))) {
								n1.add(members.get(j).getGivenName());
								flag = 1;
							}
					if (flag == 1)
						date.add(members.get(i).getDeathDate());

					if (n1.size() > 2) 
					{
						System.out.print("Individuals with date of death "
								+ n1.get(0) + ":");
						for (int k = 1; k < n1.size(); k++)
							System.out.print(" " + n1.get(k));
						System.out.println();
					}
				}
			}
		}
	}
	public void birthdatedateleap(String file) throws NumberFormatException
	{
	try
	{
			for(int i=0;i<members.size();i++)
			{
				member indi = members.get(i);	 
				String birthdate = indi.getBirthDate();
				
				if(birthdate!=null)
				{
			double d =Double.parseDouble( birthdate.substring(6));
		
			if (d % 400 == 0)
			{
				System.out.println("members who born on leap year " + " "
						+ indi.getBirthDate() + ", " + indi.getGivenName()+ " " + indi.getSurName());	
			}	
	    }
	
	}
	}
	catch (NumberFormatException n)
	{
		System.out.println("error");
	}
}
	}