import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemo
{

    public static void main(String[] args)
{   Scanner sc=new Scanner(System.in);

    int choice;
    String s;
   ArrayList<String> ob = new ArrayList<String>();

  for(;;)
{
 
    System.out.println("1:insert...2:delete....3:display....4:print whose l<5....5:exit");
    System.out.println("enter the choice");
    choice=sc.nextInt();
  switch(choice)
 {

    case 1:System.out.println("enter the string to be inserted");
            s=sc.next();
             ob.add(s);
              break;
	case 2:System.out.println(" The deleted string is:"+ob.remove(0));
                           break;
	case 3:for(int i=0;i<ob.size();i++)
                System.out.println(ob.get(i));
                        break;
        case 4: for(int i=0;i<ob.size();i++)
               {
                   if(ob.get(i).length()<5)
             System.out.println(ob.get(i));
		}
			break;

            case 5:System.exit(0);
            default:System.out.println("wrong choice");
     }

  }

}



 }
