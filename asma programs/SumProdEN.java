import java.util.Scanner;
class SumProd
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int sum=0;
int prod=1;
int rem=0;
while(n!=0)
{
int rem=n%10;
prod=prod*rem;
sum=sum+rem;
n=n/10;
}
if(sum==prod)
{
System.out.println("Number is equal");
}
else
{
System.out.println("Number is not equal");
}
}
}