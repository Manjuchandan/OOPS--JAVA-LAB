import java.util.Scanner;
 

class complex
{

 static  float real1,real2,img1,img2;


complex(float r1,float r2,float i1,float i2)
{  
   real1=r1;
   real2=r2; 
   img1=i1;
   img2=i2;   
}



void add()
{
   
  float realsum=real1+real2;
  float imgsum=img1+img2;
  System.out.println(+realsum+" +i"+imgsum);
}




void sub()
{
  float realsub=real1-real2;
  float  imgsub=img1-img2;
  System.out.println(+realsub+"i"+imgsub);
}

void product()
{
  float realmult=(real1*real2)+((img1*img2)*(-1));
  float p=(real1*img2)+(img1*real2);
  System.out.println(+realmult+"+i"+p);
}


public static void main(String[]args)
{
  Scanner sc=new Scanner(System.in);
 
  System.out.println("enter the complex no 1:");
  float r1=sc.nextFloat();
  float i1=sc.nextFloat();

  System.out.println("enter the complex no 2:");
  float r2=sc.nextFloat();
  float i2=sc.nextFloat();

   System.out.println("complex no 1 is:"+r1+"+i"+i1);
   System.out.println(" complex no 2 is:"+r2+"+i"+i2);

    complex obj=new complex(r1,r2,i1,i2);

for(;;)
{

  System.out.println("1:add\n2:sub\n:3:product\n4:exit\n");
  System.out.println("enter ur choice");
  int choice=sc.nextInt();
   switch(choice)
{

   case 1: obj.add();
	    break;

   case 2: obj.sub();
	    break;
   case 3: obj.product();
	    break;
    case 4: System.exit(0);
    default:System.out.println("invalid choice");
}
}
}
}

