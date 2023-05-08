class Ternaryg4 {
    public static void main(String[] args) 
    {
        int a=20;
        int b=30;
        int c=15;
        int d=33;
        String result=a>b&&a>c&&a>d?a+"is greatest":b>c&&b>d?b+"is greatest":c>d?c+"is greatest":d+"is greatest";
        System.out.println(result);
    }
}