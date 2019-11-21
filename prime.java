import java.util.Scanner;

class prime
{

  public static void main(String[]args)
{

  int i,n,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n");
n=sc.nextInt();

for(i=2;i<=n;i++)
{
   if(n%i==0)
	count++;
}

if(count==1)
System.out.println("it is a prime no");
else
System.out.println("it is not a prime no");
}
}
