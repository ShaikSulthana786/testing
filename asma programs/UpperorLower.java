import java.util.Scanner;
class UpperorLower
{
public static void main(String[] args)
{
Scanner Sc=new Scanner(System.in);
char ch=sc.next().CharAt(0);
if(ch>='A' && ch<='Z')
{
System.out.println(ch+" is an Uppercase");
}
else if("ch>='a' && ch<='z')
{
System.out.println(ch+"is an Lowercase");
}
else
{
System.out.println(ch+" is neither uppercase nor lowercase");
}
}
