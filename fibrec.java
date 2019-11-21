import java.util.Scanner;

class fibrec
{

   public static void main(String[]args)

{

  
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the range of series");

  int n=sc.nextInt();

  fibrec f=new fibrec();
  for(int i=0;i<n;i++)
  System.out.println(f.fibrec(i));

}

int fibrec(int n)
{
  if(n==0) return 0;
  else if(n==1) return 1;
  else return fibrec(n-2)+fibrec(n-1);
  }
}

