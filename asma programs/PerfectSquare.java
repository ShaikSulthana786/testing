import java.util.Scanner;
class PerfectSquare
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();

int count=0;

for(int i=1;i<=n;i++)
{
if(i==n*n)
count++;
break;
}

if(count>0)
{
System.out.println("The given number is perfect square");
}
else
{
System.out.println("The given number is not perfect square");
}
}
}
