import java.util.Scanner;


class fib
{

   public static void main(String[]args)

{

  int a=0,b=1,c=0,i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the range of series");

n=sc.nextInt();

if(n<=0)
System.out.println("series not found");

else
  {

     for(i=0;i<n;i++)
       {
	 c=a+b;
	
	System.out.println(c);
	
	a=b;	
	b=c;
	}

}

}
}
