import java.util.Scanner;
class string
{
   Scanner sc=new Scanner(System.in);				//can refer this also
   public static void main(String[]args)
{
  
	string ob=new string();
         ob.extract();
	ob.frequency();
 	ob.replace();
	ob.compare();
        ob.concat();
        ob.rearrange();
}

void extract()
{ 
  
  String sent;
   int m,n;
  System.out.println("enter the string");
  sent=sc.nextLine();
   System.out.println("enter the no of words to be extrscted and starting index of the extractoion\n");
    m=sc.nextInt();
    n=sc.nextInt();

  System.out.println("extracted word is:" +sent.substring(n,n+m));
}
    
void frequency()
{   

   Scanner sc=new Scanner(System.in);
  String sent,word;
  int count=0;

  System.out.println("enter the string");
  sent=sc.nextLine();
   

   System.out.println("enter the word whose frequency is to be found:");
   word=sc.next();

   String arr[]=sent.split(" ");
       
   for(int i=0;i<arr.length;i++)
    {
      
        if(arr[i].equalsIgnoreCase(word))
            count++;
    }


 System.out.println("frequency is:" +count);

}


void replace()
{
  Scanner sc=new Scanner(System.in);
String sent,word1,word2;

  System.out.println("enter the string");
  sent = sc.nextLine();

  System.out.println("enter the word to be replaced");
  word1 = sc.next();

   System.out.println("enter the replacing word");
   word2=sc.next();
  
System.out.println("result is"+sent.replace(word1,word2));

}



void compare()
{
     
   System.out.println("enter the 2 word to be compared");
 String word1=sc.next();
 String word2=sc.next();

if(word1.equalsIgnoreCase(word2))
System.out.println("they are same");
else
System.out.println("they are not same");

}


void concat()
{
   
   System.out.println("enter the 2 word to be joined");
 String word1=sc.next();
 String word2=sc.next();
 
 System.out.println("joined word is:" +word1.concat(word2));
}


void rearrange()
{
 
System.out.println("enter the word");
String word=sc.next();


char b[]=new char[word.length()];
int l=word.length();

for(int i=0;i<l;i++)
b[i]=word.charAt(i);

char temp;

  for(int j=0;j<l;j++)
   {
      for(int k=0;k<l-1;k++)
       {
          if(b[k]>b[k+1])
		{
                    temp=b[k];
			b[k]=b[k+1];
			b[k+1]=temp;
		}
	}
}



System.out.println("original word is:" +word);
System.out.println("rearrange word is:");
for(int m=0;m<l;m++)
System.out.println(b[m]);
}




}

