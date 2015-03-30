package week7;


public class n1 extends readFile 
{
	//sprint2 user story1 Naisargee
	public void birthBeforeDeath(String file)
	{
		for(int i=0; i < members.size(); i++)
		{
			member indi = members.get(i);
			String dDate = indi.getDeathDate();
			if(dDate != null)
			{
				String bYear = indi.getBirthDate();
				String deathyear[] = dDate.split(" ");
				String year[] = bYear.split(" ");
				if (Integer.parseInt(deathyear[2]) < Integer.parseInt(year[2]))
				{
					System.out.println("Death can't happen before birth for " + indi.getGivenName() +" "+ indi.getSurName());
				}	
			}
		}
	}

	//sprint2 user story2 Naisargee
	public void age(String file)
	{
		//System.out.println(members.size());
		for(int i=0; i < members.size(); i++)
		{
			 member indi = members.get(i);
			 String bYear = indi.getBirthDate();
			 String year[] = bYear.split(" ");
			 int x = Integer.parseInt(year[2]);
			 int y = 2015-x;
			 System.out.println("age of " +indi.getGivenName() +" "+ indi.getSurName()+" is "+ y);			 
		}
	}
	
	//Sprint2 user story 3 NAisargee
	
	
	public void DeathBeforeMarriage(String file)
	{
		for(int i=0; i < members.size(); i++)
		{
			for(int j=0;j<families.size();j++)
			{
				member indi = members.get(i);
				group_family fami = families.get(j); 
				String dDate= indi.getDeathDate();
				String mDate= fami.getWeddingDate();
				if(dDate != null && mDate!=null)
				{
					String deathyear[] = dDate.split(" ");
					String year[] = mDate.split(" ");
					if (Integer.parseInt(deathyear[2]) < Integer.parseInt(year[2]))
					{
						System.out.println("Death can't happen before marriage for "+ indi.getGivenName()+" " +indi.getSurName());
						i+=1;
						j+=1;
					}
				}
			}
		}
	}
	
	//Sprint3 Userstory1 Naisargee
	public void deathafter150year(String file)
	{
		//System.out.println(members.size());
		for(int i=0; i < members.size(); i++)
		{
			
			 member indi = members.get(i);
			 String bYear = indi.getBirthDate();
			 
			 String dYear=indi.getDeathDate();
			 
			if(dYear != null && bYear!=null)
			{
				String year[] = bYear.split(" ");
				String year1[]=dYear.split(" ");
				int x = Integer.parseInt(year[2]);
			 int y = Integer.parseInt(year1[2]);
			 int z=y-x;
			 if(z>150)
			 {
			 System.out.println("invalid data as death year is after 150 year of birth year which is practically not possible like "+ indi.getGivenName()+ " "+ indi.getSurName() + " " +z );
			 }
			 //System.out.println("age of " +indi.getGivenName() +" "+ indi.getSurName()+" is "+ y);			 
		}}
	}
	
	//sprint3 userstory-2 NAisargee
	public void divorceBeforeBirth(String file)
	{
		for(int i=0; i < members.size(); i++)
		{
			for(int j=0;j<families.size();j++)
			{
				member indi = members.get(i);
				group_family fami = families.get(j);
				String birthDate = indi.getBirthDate();
				String divorceDate = fami.getDivorceDate();
		// System.out.println(divorceDate);
		 
				if(birthDate != null && divorceDate != null)
				{
			 String birthyear[] = birthDate.split(" ");
			 String year[] = divorceDate.split(" ");
			 //System.out.println("nnnnnnn"); 
			 if (Integer.parseInt(year[2]) < Integer.parseInt(birthyear[2]))
			 {
		 System.out.println("Divorce cannot happen before birth" +" "+ indi.getGivenName()+" "+ indi.getSurName());
		 
		 }		
				}
				j+=1;		 
				i+=1;
		}
		
		}
		}
	
	//Sprint 3 userstory3 Naisargee
	public void DivorceBeforeMarriage(String file)
	{
		for(int i=0; i < members.size(); i++){
			for(int j=0;j<families.size();j++)
			{
		 member indi = members.get(i);
		 group_family fami = families.get(j);	 
		
	    String divorcedate = fami.getDivorceDate();
		String weddingdate= fami.getWeddingDate();
		if(divorcedate != null && weddingdate!=null){
		String divorceyear[] = divorcedate.split(" ");
		String year[] = weddingdate.split(" ");

		if (Integer.parseInt(divorceyear[2]) < Integer.parseInt(year[2]))
		System.out.println("Divorce cannot happen before marraige for "+ indi.getGivenName()+" " +indi.getSurName());
		i+=1;
		j+=1;
		}
		 }}
	}
	
	
	}
