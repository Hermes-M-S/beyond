public class Hello {
    public static void main(String[] args) {
        double a = 5;
        double c = 11;
        c = a+c;
        c=Con.set();
        System.out.println(c);
        System.out.println("Hello, Java!!!!!!! AND GIT !!!");

    }
    
    public static class Con {
        public static int set(){
            return 10;
        }
    }
}
