import java.util.Scanner;
class person
{

  static String name;
  static int age,edu,yersexp,loan;
  static  float loanamt,salary,basic,da,hra;

  person(String name,int age,int edu,int yersexp,int loan,float loanamt,float salary)
{
  this.name=name;
  this.age=age;
  this.edu=edu;
  this.yersexp=yersexp;
  this.loan=loan;
  this.loanamt=loanamt;
  this.salary=salary;
}


void iseligible()
{
  
 if(loan>=3||loanamt>100000)
 System.out.println("not eligible");
else
 System.out.println("Eligible");
}


void taxpay()
{

 if(salary>50000)
{
 System.out.println("you need to pay 2% tax");
 float tax=2*salary/100;
  System.out.println("tax amount is"+tax);
}

else
 System.out.println("no need to pay of any tax");

}


void ispromotion()
{
  if(yersexp<=2)
 System.out.println("not eligible");
else
 System.out.println(" Eligible");
}

void display()
{
  da=45*salary/100;
  hra=30*salary/100;
  System.out.println("yours details are:\n");
  System.out.println("name:\n"+name+"edu:\n"+edu+"age:\n"+age+"salary:\n"+salary+"loan:\n"+loan+"loanamt:\n"+loanamt+"yersexp:\n"+yersexp+"da:\n"+da+"hra:\n"+hra);

}

public static void main(String[]args)
{
  Scanner sc=new Scanner(System.in);
   int n;
   int i=0;
   System.out.println("enter the no of persons");
    n=sc.nextInt();

 person[] p = new person[n];
                     
 for(i=0;i<n;i++)
  {
      System.out.println("enter the name:\n");
      name=sc.next();
      System.out.println("enter the age:\n");
      age=sc.nextInt();
      System.out.println("enter the yersexp:\n");
      yersexp=sc.nextInt();

      System.out.println("enter the loan:\n");
      loan=sc.nextInt();
      
      System.out.println("enter the edu:\n");
      edu=sc.nextInt();
      System.out.println("enter the salary:\n");
      salary=sc.nextFloat();
      System.out.println("enter the loanamt:\n");
      loanamt=sc.nextFloat();

  p[i] = new person(name,age,edu,yersexp,loan,loanamt,salary);  
  p[i].display();
  p[i].iseligible();
  p[i].taxpay();
  p[i].ispromotion();
}

}

}

