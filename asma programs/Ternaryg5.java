class Ternaryg5 {
    public static void main(String[] args) 
    {
        int a=20;
        int b=30;
        int c=15;
        int d=33;
        int e=13;
        String result=a>b&&a>c&&a>d&&a>e?a+"is greatest":b>c&&b>d&&b>e?b+"is greatest":c>d?c+"is greatset":d+"is greatest";
        System.out.println(result);
    }
}