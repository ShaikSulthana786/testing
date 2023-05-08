import java.util.Scanner;
class Mult
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int sum=0;
for(int i=1; i<=10; i++)
{
sum=sum+n;
System.out.println(i+"x"+n+"-"+sum);
}
}
}