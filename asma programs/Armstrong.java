import java.util.Scanner;
class Armstrong
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the  value :");
int n=sc.nextInt();
{
int temp=n;
int num=n;
int count=0;
int sum=0;
while(n>0)
{
count++;
n/=10;
}
while(temp>0)
{
int rem=temp%10;
int prod=1;
for(int i=1; i<=count; i++)
{
prod=prod*rem;
}
sum=sum+prod;
temp/=10;
}
if(sum==num)
{
System.out.println("armstromg");
}
else
{
System.out.println("not armstrong");
}
}
}
}