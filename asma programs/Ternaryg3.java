class Ternaryg3 {
    public static void main(String[] args) 
    {
        int a=20;
        int b=30;
        int c=15;
        String result=a>b&&a>c?a+"is greatest":b>c?b+"is greatest":c+"is greatest";
        System.out.println(result);
    }
}