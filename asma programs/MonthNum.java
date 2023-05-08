import java.util.Scanner;
class MonthNum
{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the Character");
String month=sc.next();
switch(month)
{
case "January":System.out.println("is 1");
break;
case "February":System.out.println("is 2");
break;
case "March":System.out.println("is 3");
break;
case "April":System.out.println("is 4");
break;
case "May":System.out.println("is 5");
break;
case "June":System.out.println("is 6");
break;
case "July":System.out.println("is 7");
break;
case "August":System.out.println("is 8");
break;
case "September":System.out.println("is 9");
break;
case "October":System.out.println("is 10");
break;
case "November":System.out.println("is 11");
break;
case "December":System.out.println("is 12");
break;
default:System.out.println("invalid MonthNum");
}
}
}