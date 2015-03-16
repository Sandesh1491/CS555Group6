package week7;

public class n1 extends readFile 
{
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
}
