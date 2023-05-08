import java.util.Scanner;
class Squares
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
for(int i=1;i<=500;i++)
{
boolean check=false;
for(int j=1;j<=i;j++)
{
if(j*j==i)
{
check=true;
break;
}
}
if(check)
{
System.out.println(i+"perfect square");
}
}
}
}