import java.util.Scanner;
class ProdDigit
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int temp=n;
int prod=1;
int rem=0;
while(n>0)
{
 rem=n%10;
prod=prod*rem;
n=n/10;
}
{
System.out.println("prod of digits :"+prod);
}
}
}