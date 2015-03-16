package week7;

public class s1 extends readFile
{
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
					}
					if(i < members.size())
					{
						i+=1;
					}	
				}	
			}
		}
	}
}
