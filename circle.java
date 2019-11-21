import java.util.Scanner;

class Circle
{
    double r;
 
    Circle(double r)
   {
       this.r=r;
   }

   double area()
   {
      return 3.14*r*r;
   } 

						//take care about capital C and small c
}

class sector extends Circle
{

   double angle;
 
  sector(double r,double angle)
  {

        super(r);
	this.angle=angle;
   }
  double area()
  {
    return 0.5*r*r*angle;
  }


}

class segment extends Circle
{


   double length;

 segment(double r,double length)
{
    super(r);

   this.length=length;

}

double area()
{
     
    return r*r*((r-length)/r)-(r-length)*Math.sqrt((2*r*length-length*length));
}

}

class circle{

  public static void main(String[]args)
{
   int ch;
	
 Scanner sc=new Scanner(System.in);

  for(;;)
   {
     
	System.out.println("1:circle\n2:sector\n3:segment\n4:exit\n");
	
	System.out.println("enter your choice");
	ch=sc.nextInt();
         double r;
	switch(ch)
	{      
		

		case 1:System.out.println("enter the radius of a circle");
			 r=sc.nextDouble();
			Circle ob1=new Circle(r);
			System.out.println(+ob1.area());
				break;

		
		case 2:System.out.println("enter the radius:");
			  r=sc.nextDouble();
			System.out.println("enter the angle in radian");
			double angle=sc.nextDouble();
			sector ob2=new sector(r,angle);
			System.out.println(+ob2.area());
				break;
		case 3:System.out.println("enter the radius:");
			 r=sc.nextDouble();
			System.out.println("entre the length");
			double length=sc.nextDouble();
			segment ob3=new segment(r,length);
			System.out.println(+ob3.area());
				break;

		case 4:System.exit(0);
		default:System.out.println("invalid choice");
   		}
	   }
	}
}































