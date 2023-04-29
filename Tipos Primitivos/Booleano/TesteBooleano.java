public class TesteBooleano {
    public static void main(String args[]) {
        boolean a = false;
        boolean b;

        if (a == true) {
            System.out.println("a é verdadeiro");
        }
        else System.out.println("a é falso");

        b = !a; // b = não a -> b = false

        if (b == true) System.out.println("b é verdadeiro.");
        else System.out.println("b é falso.");
    }
}
