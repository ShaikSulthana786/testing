import java.util.Scanner;
class ADS
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Character");
char ch=sc.next().charAt(0);
if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
{
System.out.println(ch+ "The given character is Alphabet");
}
else if(ch>=0 && ch<=9)
{
System.out.println(ch+ "The given character is digit");
}
else
{
System.out.println(ch+ "The given character is special character");
}
}
}