import java.util.Scanner;
class ESumProd
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the m number");
int m=sc.nextInt();
System.out.println("Enter the n number");
int n=sc.nextInt();
int sum=0;
int prod=1;
{
for(int i=m; i<=n; i++)
if(i%2==0)
{
sum=sum+i;
prod=prod*i;
}
System.out.println("sum is :"+sum);
}
{
System.out.println("prod is :"+prod);
}
}}