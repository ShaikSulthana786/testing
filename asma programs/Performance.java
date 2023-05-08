import java.util.Scanner;
class Performance
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Marks");
int marks=sc.nextInt();
if(marks>=91 && marks<=100)
{
System.out.println("Student performance is excellent");
}
else if(marks>=81 && marks<=90)
{
System.out.println("Student performance is very good");
}
else if(marks>=71 && marks<=80)
{
System.out.println("Student performance is good");
}
else if(marks>=61 && marks<=70)
{
System.out.println("Student performance is average");
}
else if(marks>=56 && marks<=60)
{
System.out.println("Student performance below average");
}
else if(marks>=51 && marks<=55)
{
System.out.println("Student performance border raja");
}
else
{
System.out.println("student is thopu");
}
}
}

