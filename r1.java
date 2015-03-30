package week7;

public class r1 extends readFile
{
	//Sprint2 UserStory-1
	public void indicount(String file) 
	{
		int indi = members.size();
		System.out.println("Total number of Individual are : "+indi);
	}

		//Sprint2 UserStory-2
	public void fatherMale(String file)
	{
		
		for(int i=0; i < members.size(); i++)
		{
			 member indi = members.get(i);
			 String name=indi.getGivenName();
			 System.out.println(name);
			 
		}
		
	}
	
	//Sprint3 UserStory-1
	public void famicount(String file)
	{
		int fami=families.size();
		System.out.println("Total number of families are :"+fami);
	}
	
	//Sprint3 UserStor-2
	public void deadpeople(String file)
	{int x=0;
		for(int i=0; i < members.size(); i++)
		{
			 
			 member indi = members.get(i);
			 String dDate = indi.getDeathDate();
				if(dDate != null)
				{
					x=x+1;
				}
				
		}

		System.out.println("number of dead people are : "+x);
	}
	
	//Sprint3 UserStory-3
	public void divorcecount(String file) {
		for(int i=0; i < families.size(); i++){
			 group_family fami = families.get(i);
			 member indi = members.get(i);
			 String divorceDate = fami.getDivorceDate();
			 String husband = fami.getHusband();
			// System.out.println(husband);
			 String wife = fami.getWife();
			 if(divorceDate != null){
			 String divorceyear[] = divorceDate.split(" ");
			 System.out.println("The Divorce Dates are:"+" "+fami.getDivorceDate());
			 }
			}
	}
}
