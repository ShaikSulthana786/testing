import java.util.Scanner;
class Alpha26
{
public static void main(String[] args)
Scanner sc=new Scanner(system.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int sum=0;
int rem=0;
while(n>0)
{
int rem=n%10;
sum=sum+rem;
n=n/10;
}
if(sum>26)
{
int n=sum;
sum=0;
while(n>0)
{
int rem=n%10;
sum=sum+rem;
n=n/10;
}
int b=1;
for(char ch='A';ch<='Z';ch++)
if(sum==b)
}}
{
System.out.println("Alphabet present in"+sum+" th position is :"+ch);
break;
}
b++;
}
}