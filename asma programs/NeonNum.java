import java.util.Scanner;
class NeonNum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
Count=0;
int square=n*n;
int sum=0;
while(square>0)
{
int rem=square%10;
sum=sum+rem;
square=square/10;
}
if(sum==n)
Count++;
{
System.out.println("The given number is nean");
}
else
{
System.out.println("The given number is not nean);
}
}