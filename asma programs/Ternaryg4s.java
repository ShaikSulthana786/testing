import java.util.Scanner;
class Ternaryg4s {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        System.out.println("Enter the fourth number");
        int d=sc.nextInt();
        String result=a>b&&a>c&&a>d?a+"is greatest":b>c&&b>d?b+"is greatest":c>d?c+"is greatest":d+"is greatest";
        System.out.println(result);
    }
}