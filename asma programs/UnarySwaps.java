import.java.util.scanner
class UnarySwaps
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner (system.in);
      System.out.println("Enter the first number");
      int a=sc.nextInt();
      System.out.println("Enter the second number");
      int b=sc.nextInt();
        System.out.println("Before swapping a="+a+" and b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a="+a" and b="+b);
    }
}