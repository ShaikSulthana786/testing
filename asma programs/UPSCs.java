import java.util.Scanner
class Armys
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter the age");
      int age=sc.nextInt();
      System.out.println("Enter the weight")
      int weight=sc.nextInt();
      System.out.println("Enter the height")
      double height=sc.nextDouble();
      if(age>=18&&weight>60&&height>5.8)
      {
      System.out.println("You are eligible");
      }
      else
      System.out.println("You are not eligible");
    }
}