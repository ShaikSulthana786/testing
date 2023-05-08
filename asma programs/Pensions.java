import java.util.Scanner;
class Pensions
{
public static void main(String[] args)
{
System.out.println("welcome to pension scheme");
Scanner sc=new Scanner (System.in);
System.out.println("Enter the age");
int age=sc.nextInt();
if(age>60)
{
System.out.println("Eligible for pension");
}
else
System.out.println("Not Eligible for pension");
}
}