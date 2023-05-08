import java.util.Scanner;
class Square
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();

boolean check=false;

for(int i=1;i<=n;i++)
{
if(n==i*i)
check=true;
break;
}

if(check)
{
System.out.println("The given number is perfect square");
}
else
{
System.out.println("The given number is not perfect square");
}
}
}
