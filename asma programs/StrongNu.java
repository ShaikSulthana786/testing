import java.util.Scanner;
class StrongNu
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
for(int i=1;i<=1000;i++)
{
int temp=n;
int sum=0;
while (temp>0)
{
int rem=temp%10;
int fact=1;
for( i=1;i<=rem;i++)
{
fact=fact*i;
}
sum=sum+fact;
temp=temp/10;
}
if(n==sum)
{
System.out.println(n+"is strong number");
}
}
}
}