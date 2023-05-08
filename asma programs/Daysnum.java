import java.util.Scanner;
class DaysNum
{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the day name");
String day=sc.next();
switch(day)
{
case "Monday":System.out.println(day+"is 1");
break;
case "Tuesday":System.out.println(day+"is 2");
break;
case "Wednesday":System.out.println(day+"is 3");
break;
case "Thursday":System.out.println(day+"is 4");
break;
case "Friday":System.out.println(day+"is 5");
break;
case "Saturday":System.out.println(day+"is 6");
break;
case "Sunday":System.out.println(day+"is 7");
break;
default:System.out.println("invalid day");
}
}
}