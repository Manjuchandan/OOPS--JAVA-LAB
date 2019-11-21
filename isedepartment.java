package ISE;
import dept.*;
import java.util.Scanner;

public class isedepartment implements department
{    int i;
     Scanner sc =new Scanner(System.in);
     faculty[] ob;

  public void readdata()
  {      int n;
         Scanner sc =new Scanner(System.in);
         System.out.println("enter the total no of employes");
         n=sc.nextInt();
	
         ob=new faculty[n];
    
   for(i=0;i<n;i++)
{
         ob[i]=new faculty();

         System.out.println("Faculty["+(i+1)+"] details:");
         System.out.println("Enter Name:");
         sc.nextLine();
         ob[i].name=sc.nextLine();
  	        
	 System.out.println("Enter age:");
	 int tempage=sc.nextInt();
        
   	if(tempage<=58)
	{
	   ob[i].age=tempage;
	}
   else
	{
     
		throw new java.lang.Error("Age Exception");
         }

         System.out.println("Enter designation:");
         sc.nextLine();
         ob[i].designation=sc.nextLine();
	 System.out.println("Enter subhandle:");
         ob[i].subhandle=sc.nextLine();
	 System.out.println("Enter yearexp:");
         ob[i].yearexp=sc.nextInt();
	 System.out.println("Enter joingdate:");
         ob[i].joindate=sc.nextInt();
     }

}//fn end

public void printdata()
{ Scanner sc =new Scanner(System.in);
     for(int i=0;i<ob.length;i++)
        {
            if(ob[i].yearexp>=20)
              {
                System.out.println("NAME: "+ob[i].name);
                System.out.println("AGE: "+ob[i].age);
                System.out.println("DESIGNATION: "+ob[i].designation);
                System.out.println("YEARS OF EXPERIENCE: "+ob[i].yearexp);
                System.out.println("JOINING DATE: "+ob[i].joindate);
                System.out.println("SUBJECTS HANDLED: "+ob[i].subhandle);
              }
	}
}

}
