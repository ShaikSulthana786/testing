import java.util.Scanner;
class Spy
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int sum=0;
int tem=n;
int prod=1;
int rem=0;
while(n>0)
{
 rem=n%10;
sum=sum+rem;
prod=prod*rem;
n=n/10;
}
if(sum==prod)
{
System.out.println("Given number is spy number");
}
else
{
System.out.println("Given number is not spy number");
}
}
}