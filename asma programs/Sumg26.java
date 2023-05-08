import java.util.Scanner;
class Sumg26
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int sum=0;
int rem=0;
while(n>0)
{
int rem=n%10;
sum=sum+rem;
n=n/10;
}
if(sum>26)
{
int a=sum;
sum=0;
while(a>0)
{
int rem=a%10;
sum=sum+rem;
a=a/10;
}
}
System.out.println(sum);
}
}