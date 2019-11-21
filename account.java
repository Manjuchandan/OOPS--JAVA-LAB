import java.util.Scanner;

class account
{

   int acno;
   float balanceamt;
   String name;
   long phno;

 
 void getinput()
{   
   Scanner sc=new Scanner(System.in);

  System.out.println("Enter the name:\n");
  name=sc.nextLine();
  
  System.out.println("Enter the acno:\n");
  acno=sc.nextInt();

  System.out.println("Enter the phno:\n");
  phno=sc.nextLong();


  System.out.println("Enter the balanceamt:\n");
  balanceamt=sc.nextFloat();

}  

void deposit()
{
    Scanner sc=new Scanner(System.in);
 
    System.out.println("Enter the amount to be deposited:\n");
    float depamt=sc.nextFloat();
  
    System.out.println("After depositing the amount the main balance amount is::\n");
    balanceamt+=depamt;
   
    System.out.println("Main balance amount is\n "+balanceamt);
   
}



void withdraw()
{   Scanner sc=new Scanner(System.in);

      System.out.println("Enter the amount to be withdrawn:\n");
      float withamt= sc.nextFloat(); 

  if(balanceamt==0)
  System.out.println("SORRY Insufficient balance:\n");
else
{
     System.out.println("After withdrawing the amount the main balance amount is::\n");
     balanceamt-=withamt;
     System.out.println("Main balance amount is\n "+balanceamt);
   
}

}

public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    account ac=new account();
    ac.getinput();  

    System.out.println("2:deposit\n3:withdraw\n4:exit\n");
    System.out.println("Enter your choice");
    int choice=sc.nextInt(); 
 switch(choice)
{
    
 
        case 2:ac.deposit();
	        break;

        case 3:ac.withdraw();
		break;

       case 4:System.exit(0);

      default:System.out.println("invalid choice");


}
}
}
