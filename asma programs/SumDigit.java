import java.util.Scanner;
class SumDigit
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int temp=n;
int sum=0;
int rem=0;
while(n>0)
{
 rem=n%10;
sum=sum+rem;
n=n/10;
}
{
System.out.println("Sum of digits :"+sum);
}
}
}