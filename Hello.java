public class Hello {
    public static void main(String[] args) {
        double a = 5;
        double c = 11;
        c = a+c;
        c=Con.set();
        System.out.println(c);
        System.out.println("Hello, Java!!!!!!! AND GIT !!!");
	System.out.println("Nano");
	System.out.println("Red");
	System.out.println("BLUE");
	System.out.println("Grenn");
    }
    
    public static class Con {
        public static int set(){
            return 10;
        }
    }
}


