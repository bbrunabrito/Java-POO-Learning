public class TesteOA {
    public static void main (String [] args) {
        short x = 2;
        double a = 7.8;
        int y = 3;
        double b = 3.4;

        System.out.println("x é " + x + ", y é " + y);
        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x/y = " + (x / y));
        System.out.println("x % y = " + (x % y));
        System.out.println("\na é " + a + ", b é " + b);
        System.out.println("a / b = " + (a / b));
        
        a = x / y;
        System.out.println("a = " + a);
    }
}
