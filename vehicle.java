import java.util.Scanner;
abstract class Vehicle
{
 int year;
 
  Vehicle(int y)
  {
    year=y;
  }

   abstract void getdata();
   
   abstract void putdata();

}


class twowheeler extends Vehicle
{  Scanner sc=new Scanner(System.in);

   int type,tyre;
 
  twowheeler(int y,int t)
  {
     super(y);
     tyre=t;
  }

  void getdata()
 {
   System.out.println("enter the type of vehicle");
   type=sc.nextInt();
  
}

void putdata()
{
  
    System.out.println(year);
    System.out.println(tyre);
    System.out.println(type);


}

}


final class fourwheeler extends Vehicle
{
      Scanner sc=new Scanner(System.in);
      int weight,height;
 
  fourwheeler(int y,int w)
  {
     super(y);
     weight=w;
  }

  void getdata()
 {
   System.out.println("enter the height of vehicle");
   height=sc.nextInt();
  
}

void putdata()
{
  
     System.out.println(year);
     System.out.println(weight);
     System.out.println(height);
}

}

class mytwowheeler extends twowheeler
{
   Scanner sc=new Scanner(System.in);    // do not reintialize the values as (int&float) in extended class.
   int engno,colourno;
 
  mytwowheeler(int y,int t,int eno) 
  {
    super(y,t);
    engno=eno;
  }
void getdata()
 {
   System.out.println("enter the colourno of vehicle");
   colourno=sc.nextInt();
  
}

void putdata()
{
   System.out.println(year);
   System.out.println(tyre);
   System.out.println(colourno);
   System.out.println(engno);
}


}

public class vehicle
{
  public static void main(String[]args)
{
   int year;

   Scanner sc=new Scanner(System.in);
    System.out.println("enter the year of manuf");
    year=sc.nextInt();
    System.out.println("enter the tyres");
    int tyre=sc.nextInt();
    System.out.println("enter the eno");
    int eno=sc.nextInt();

   mytwowheeler ob1=new mytwowheeler(year,tyre,eno);
   ob1.getdata();
   ob1.putdata();

     System.out.println("enter the year of manuf");
     year=sc.nextInt();
     System.out.println("enter the weight");
    int weight=sc.nextInt();
   fourwheeler ob2=new fourwheeler(year,weight);
   
  ob2.getdata();
   ob2.putdata();
}
}



















