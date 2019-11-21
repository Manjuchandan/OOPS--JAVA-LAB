import java.util.Scanner;
abstract class vehicles
{    vehicles()
    {
    }
    int yr_of_manuf;
    abstract void getData();
    abstract void putData();
}
class twoWheeler extends vehicles
{    String make;
    void putData()
    {    Scanner sc= new Scanner(System.in);
        System.out.println("enter the vehicle make");
         make = sc.nextLine();
    }
    void getData()
    {    System.out.println("the make of vehicle is " +make);
        System.out.println("the year of manufacutring is"+super.yr_of_manuf);
    }
}

class MyTwoWheeler extends twoWheeler
{    MyTwoWheeler()
    {super.yr_of_manuf = 1999;
    }
    
}
final class fourWheeler extends vehicles
{    String make;
    void putData()
    {    Scanner sc= new Scanner(System.in);
        System.out.println("enter the vehicle make");
         make = sc.nextLine();
        System.out.println("enter the year of manufacutring");
        yr_of_manuf = sc.nextInt();
    }
    void getData()
    {    System.out.println("the make of vehicle is " +make);
        System.out.println("the year of manufacutring is"+yr_of_manuf);
    }
}
public class lohith
{    public static void main(String args[])
    {    MyTwoWheeler ob = new MyTwoWheeler();
        ob.putData();
        ob.getData();
        fourWheeler ab = new fourWheeler();
        ab.putData();
        ab.getData();
    }
}

