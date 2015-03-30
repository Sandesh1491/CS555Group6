package week7;

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
		}}
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
}
