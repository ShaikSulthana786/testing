import java.util.Scanner;
class SumProd
{
public Static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int sum=0;
int prod=1;
{
for(int i=m; i<=n; i++)
{
sum=sum+i;
prod=prod*i;
}
System.out.println("sum is :"+sum);
}
{
System.out.println("prod is :"+prod);
}
}
}