import java.util.Scanner;
class StrongNum
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int temp=n;
int sum=0;
while (n>0)
{
int rem=n%10;
n=n/10;
int fact=1;
for(int i=1;i<=rem;i++)
{
fact=fact*i;
}
{
sum=sum+fact;
}
}
if(sum==temp)
{
System.out.println("Given number"+temp+" is strong number");
}
else
{
System.out.println("Given number"+temp+" is  not strong number");
}
}
}
