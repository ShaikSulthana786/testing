import java.util.Scanner;
class ChorSp
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Character");
char ch=sc.next().charAt(0);
if(ch<='A'&&ch<='Z'||ch>='a'&&ch<='z')
{
System.out.println("The given character is alphabet" );
}
else
{
System.out.println("The given character is specialcase");
}
}
}

