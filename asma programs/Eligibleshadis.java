import java.util.Scanner;
class EligibleShadis
{
    public static void main(String[] args)
    {
      System.out.println("welcome to shadi.com");
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the age");
      int age=sc.nextInt();
      if(age>=21)
      {
      System.out.println("Eligible for shadi");
      }
      else
      {
      System.out.println("Not elible for shadi");
      }
}}