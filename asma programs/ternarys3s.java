import java.util.Scanner;
class Ternarys3s {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        String result=a<b&&a<c?a+"is smallest":b<c?b+"is smallest":c+"is smallest";
        System.out.println(result);
    }
}