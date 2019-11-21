import java.util.Scanner;


class stack
{

    int stack[];   					//or int stack[]=new int[10];
   static int item,top;


stack(int size)
{

 stack=new int[size];
   top=-1;

}

 void push(int item)
{
   if(top==9)
System.out.println("stack is full");
else
 stack[++top]=item;
}


void pop()
{
  if(top==-1)
System.out.println("stack is empty");
else
{
    item=stack[top];
    top=top-1;
}

}

void display()
{
  int i;
if(top==-1)
System.out.println("stack is empty");
else
{
    System.out.println("stack elements are:");
    for(i=0;i<=top;i++)
 
  System.out.println(+stack[i]);
}



}



  public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    stack ob=new stack(10);
    for(;;)
{

    System.out.println("1:push\n2:pop\n3:display\n4:exit\n");
    System.out.println("Enter your choice");
    int choice=sc.nextInt(); 
 switch(choice)
{
    
          case 1: System.out.println("enter the item to be inserted\n");
                   item=sc.nextInt();
                    ob.push(item);
                     break;
          case 2:  ob.pop();
	         break;

          case 3:  ob.display();
 		 break;
 
          case 4:System.exit(0);

        default:System.out.println("invalid choice");


}
}
}




}




