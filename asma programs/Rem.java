import java.util.Scanner;
class Rem
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the dividend number");
int m=sc.nextInt();
System.out.println("Enter the divisor number");
int n=sc.nextInt();
{
while(m>=n)
{
m=m-n;
}
}
System.out.println("Remainder is "+m);
}
}