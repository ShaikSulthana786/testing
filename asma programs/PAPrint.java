import java.util.Scanner;
class PAPrint
{
public static void main("String[] args)
Scanner sc=new Scanner(System.in);
System.out.println("enter the character");
int pos=1;
int x=1;
for(char ch='A'; ch<='Z'; ch++;)
{
if(pos==x)
break;
System.out.println(ch);
}
}