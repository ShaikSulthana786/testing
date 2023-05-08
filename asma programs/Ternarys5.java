class Ternarys5 {
    public static void main(String[] args) 
    {
        int a=20;
        int b=30;
        int c=15;
        int d=33;
        int e=13;
        String result=a<b&&a<c&&a<d&&a<e?a+"is smallest":b<c&&b<d&&b<e?b+"is smallest":c<d?c+"is smallest":d+"is smallest";
        System.out.println(result);
    }
}