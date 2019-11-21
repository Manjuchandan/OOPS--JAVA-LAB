package studentpackage;
import java.util.Scanner;

public class Registerstudent implements student
{   Scanner sc=new Scanner(System.in);

    public String s1,s2,s3;
    public int m1,m2,m3,c1,c2,c3;
    public static  double sgpa;

  public void setname()
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the name of the student:  ");
     String name=sc.next(); 
   }

  public void setbranch()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the branch of the student:  ");
      String branch=sc.next(); 
   }

 public void getdetails()
{
   Scanner sc=new Scanner(System.in);
   
 
    System.out.println("enter the subjects register by the student in :  ");
    String s1=sc.next();
    String s2=sc.next();
    String s3=sc.next();

    System.out.println("enter the credit for their respective subjects:  ");
    int c1=sc.nextInt();
    int c2=sc.nextInt();
    int c3=sc.nextInt();
   
    int totalcredits = (c1+c2+c3);
    System.out.println("TOTAL CREDITS REGISTERED IS:"+totalcredits);

    System.out.println("enter the marks obtained by the student:");
    int m1=sc.nextInt();
    int m2=sc.nextInt();
    int m3=sc.nextInt();
    int totalmarks = (m1+m2+m3);
    System.out.println("TOTAL MARKS IS:"+totalmarks);

 if(totalcredits<=30)
 {  
   System.out.println("accepted");
 }
else
{
   throw new java.lang.Error("CreditLimit");
}


 sgpa=((totalmarks/totalcredits)/2.5);

System.out.println("SGPA OF STUDENT IS :"+sgpa);
System.out.println("ASSUMPTION IS CALCULATION IS ONLY FOR ONE SEM THEREFORE:");
System.out.println("CGPA OF STUDENT IS :"+sgpa);

 if(totalmarks>270)
          System.out.println("S GRADE");
else if(+totalmarks>240)
          System.out.println("A GRADE");
else if(+totalmarks>210)
          System.out.println("B GRADE");
else if(+totalmarks>180)
          System.out.println("C GRADE");
else
         System.out.println("F GRADE");


if(sgpa<=10)
System.out.println("Accepted SGPA");
else
{
  throw new java.lang.Error("InvalidSgpa");
}


}

}
