class Ternarys4 {
    public static void main(String[] args) 
    {
        int a=20;
        int b=30;
        int c=15;
        int d=33;
        String result=a<b&&a<c&&a<d?a+"is smallest":b<c&&b<d?b+"is smallest":c<d?c+"is smallestt":d+"is smallest";
        System.out.println(result);
    }
}