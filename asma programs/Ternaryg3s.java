import java.util.Scanner;
class Ternaryg3s {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        String result=a>b&&a>c?a+"is greatest":b>c?b+"is greatest":c+"is greatest";
        System.out.println(result);
    }
}