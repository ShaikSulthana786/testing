import java.util.Scanner;
class JEEMainMarks
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Marks");
int marks=sc.nextInt();
if(marks>=341 && marks<=360)
{
System.out.println("You are eligible to get admission in IIT");
}
else if(marks>=321 && marks<=340)
{
System.out.println("You are eligible to get admission in NIT");
}
else if(marks>=301 && marks<=320)
{
System.out.println("You are eligible to get admission in IIIT");
}
else
{
System.out.println("You are eligible to get admission in Jspiders");
}
}
}


