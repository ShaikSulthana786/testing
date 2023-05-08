import java.util.Scanner;
class Digit
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int temp=n;
int count=0;
while(n>0)
{
count++;
n=n/10;
}
System.out.println("Given number"+temp+"has"+count+"Digits");
}
}
