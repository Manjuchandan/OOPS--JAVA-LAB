import java.util.Scanner;

class matrix
{
   int a[][]=new int[10][10];
   int b[][]=new int[10][10];
   int c[][]=new int[10][10];
 
  int r1,r2,c1,c2,i,j,k;

matrix(int r1,int c1,int r2,int c2)
{
  
}
   


void read(int r1,int c1,int r2,int c2)
{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the elemnts of 1st matrix\n"); 
   for(i=0;i<r1;i++)
   for(j=0;j<c1;j++)
   a[i][j]=sc.nextInt();



  System.out.println("enter the elemnts of 2nd matrix\n"); 
   for(i=0;i<r2;i++)
   for(j=0;j<c2;j++)
   b[i][j]=sc.nextInt();


}

 void product(int r1,int c1,int r2,int c2)
{

  if(r1!=c2)
System.out.println("multiplication is not possible");
else
{    c[i][j]=0;
      
  for(i=0;i<r1;i++)
  
    for(j=0;j<c2;j++)
     
       for(k=0;k<c1;k++)
        
          
 c[i][j]=(c[i][j]+a[i][k]*b[k][j]);
    
		System.out.println("product of matrices are:");
                          for(i=0;i<r1;i++)
                          for(j=0;j<c2;j++)
                         System.out.println(+c[i][j]);


}
}

 public static void main(String[] args)
{

   Scanner sc=new Scanner(System.in);

  System.out.println("enter the rows and columns of 1st and 2nd matrices\n");
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    int r2=sc.nextInt();
    int c2=sc.nextInt();
   matrix ob=new matrix(r1,c1,r2,c2);
   ob.read(r1,c1,r2,c2);
   ob.product(r1,c1,r2,c2);
}

}




 




























