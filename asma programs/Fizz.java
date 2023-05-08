import java.util.Scanner;
class Fizz
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
if (num%5==0 && num%3==0)
{
System.out.println("you will get fizz");
}
else if(num%5==0)
{
System.out.println("you will get buzz");
}
else if(num%3==0)
{
System.out.println("you will get both fizz and buzz");
}
else
{
System.out.println("you will not get fizz and buzz");
}
}
}

