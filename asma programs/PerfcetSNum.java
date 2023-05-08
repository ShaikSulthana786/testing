import java.util.Scanner;
class PerfectSNum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
for(int i=1;i<=500;i++)
int count=0;

for(int i=1;i<=n;i++)
{
if(i==n*n)
count++;
break;
}

if(count>0)
{
System.out.println(n+"The given number is perfect square");
}
else
{
System.out.println(n+"The given number is not perfect square");
}
}
}