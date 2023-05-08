import java.util.Scanner;
class Palindrom
(
public static void main(String[] args)
Scanner sc=new Scanner(system.in);
System.out.println("Enter the number");
int n=sc.nextInt();
{
int temp=n;
int reverse=0;
while(n>0)
{
int remainder=n%10;
    reverese=Reverse*10+remainder;
    n/=10;
}
if(temp==reverse)
{
System.out.println("Given number"+temp+" is palindrom");
}
else
{
System.out.println("Given number"+temp+" is not palindrom");
}
}
