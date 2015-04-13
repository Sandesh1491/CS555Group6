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
	public void divorcecount(String file) 
	{
		for(int i=0; i < families.size(); i++)
		{
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
//Sprint 4 userstory-1
	
	public void widowercount(String file) {
		for(int i=0; i < families.size(); i++){
			 group_family fami = families.get(i);
			 member indi = members.get(i);
			 String husband = fami.getHusband();
			 String deathDate = indi.getDeathDate();
			 String wife = fami.getWife();
			 String name = indi.getName();
			 if( deathDate != null) {
			 String deathyear[] = deathDate.split(" ");
			 System.out.println("List of husband who died:"+" "+ fami.getHusband());
			
			 }
			}
	}
	
	//sprint 4 userstory2 rakesh
	public void printAgeChild(String file)
	{
	int ageCount=0;
	for(int i=0; i < members.size(); i++)
	{
		 member indi = members.get(i);
		 
		 if(indi.getAge() <= 18)
		 {	 
			 ageCount +=1;
			 System.out.println("The age of Child "+ indi.getIdentifier()+ " " + indi.getGivenName() +" "+ indi.getSurName() + " is " +indi.getAge());}
		}
	System.out.println("The Total Number of Children less than 18 years who are not aadult are "+ageCount);System.out.println();
	}	
	

}
