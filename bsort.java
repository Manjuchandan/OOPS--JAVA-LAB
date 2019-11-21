import java.util.Scanner;
 class bsort
{
  public static void main(String[]args)
{

  int a[]=new int[10];
   int i,n,temp,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
n=sc.nextInt();
System.out.println("enter the elements of array");
for(i=0;i<n;i++)
a[i]=sc.nextInt();


for(i=0;i<n;i++)
{
	for(j=0;j<n-1;j++)
	  {
            if(a[j]>a[j+1])
		{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
		}
	}

System.out.println("sorted elements are:");
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}
