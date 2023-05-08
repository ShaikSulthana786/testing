import java.util.Scanner;
class Palindromc
(
public static void main(String[] args)
{
for(int i=100; i<=300; i++;)
{
int n=i;
int temp=n;
int reverse=0;
while(n>0)
{
int remainder=n%10;
    reverese=Reverse*10+remainder;
    n/=10;
}
if(temp==reverse)
{
System.out.println("Given Number "+temp+" is palindrom");
}
}
