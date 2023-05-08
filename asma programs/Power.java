import java.util.Scanner;
class Power
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base value :");
int a=sc.nextInt();
System.out.println("Enter the power value :");
int n=sc.nextInt();
int prod=1;
for(int i=1;i<=n;i++)
{
prod*=a;
}
System.out.println(a+" power "+n+" value is :"+prod);
}
}