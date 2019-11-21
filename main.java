package main;

import main.faculty;

public interface department
{
  void readdata(faculty f);
  void printdata(faculty f);

}
package main;
public class faculty
{
  public String name,designation,joiningdate,subhandle;
  public int age,yearexp;
}

package main.ise;
 
import java.util.Scanner;
import main.*;

public class isedepartment implements department
{
  public void readdata(faculty f)
{

   int tempage;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the name:  ");
  f.name=sc.next();
  System.out.println("enter the age:  ");
  tempage=sc.nextInt();

  if(tempage<=58)
  {
    f.age=tempage;
 }


else
{
  throw new java.lang.Error("age exception");
}

System.out.println("enter the designation:  ");
  f.designation=sc.next();

System.out.println("enter the yearexp:  ");
  f.yearexp=sc.nextInt();
System.out.println("enter the joingdate:  ");
  f.joingdate=sc.next();
System.out.println("enter the subhandle:  ");
  f.subhandle=sc.next();
}


public void printdata(faculty f)
{
   System.out.println("\nname:  " +f.name);
  System.out.println("\nage:  " +f.age);
  System.out.println("\ndesignation:  " +f.designation);
  System.out.println("\nyearexp:  " +f.yearexp);
  System.out.println("\njoingdate:  " +f.joingdate);
  System.out.println("\nsubhandle:  " +f.subhandle);
}

}

package main;


import java.util.Scanner;
import main.Faculty;
import main.ISE.ISE_Department;

public class main {

    public static void main(String[] args) {

        int menu, counter = 0; // Counter keeps track of the no of faculty profiles
        Faculty f[] = new Faculty[10]; // Array of Faculty objects
        String s;
        boolean flag = false;
        ISE_Department ise = new ISE_Department();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add new faculty record");
            System.out.println("2. Print details of existing faculty record");
            System.out.println("3. Delete a faculty record");
            System.out.println("4. List of experienced faculty");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            menu = sc.nextInt();

            switch (menu) {
            case 1:
                f[counter] = new Faculty();
                ise.readData(f[counter]); // Calling ise's readData function which in in ISE_Department file with
                                          // faculty object as parameter
                counter++;
                break;

            case 2:
                System.out.print("Enter name of the faculty: ");
                s = sc.next();
                flag = false;
                for (int i = 0; i < counter; i++) {

                    if (f[i] != null) {

                        if (s.equals(f[i].name)) {
                            ise.printData(f[i]);
                            flag = true; // If profile found
                        }
                    }
                }
                if (flag == false)
                    System.out.println("Faculty not found");
                break;

            case 3:
                System.out.print("Enter name of the faculty: ");
                s = sc.next();
                flag = false;
                for (int i = 0; i < counter; i++) {
                    if (f[i] != null) {
                        if (s.equals(f[i].name)) {
                            f[i] = null; // Makes the pointer in the array null so it doesn't point to that object
                                         // anymore
                            flag = true;
                        }
                    }
                }
                if (flag == false)
                    System.out.println("Faculty not found");
                break;

            case 4:
                for (int i = 0; i < counter; i++) {
                    if (f[i] != null) {
                        if (f[i].yearsOfExperience >= 20) {
                            ise.printData(f[i]);
                        }
                    }
                }
                break;

            case 5:
                System.exit(0);

            default:
                System.out.print("Wrong choice\n");
            }
        }
    }
}
























