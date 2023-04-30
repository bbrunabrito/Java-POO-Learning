package Estruturas.Repeticao;

public class TesteDoWhile {
    public static void main (String args[]) {
        int i = 0;

        System.out.println("i = " + i);

        do {
            i--;
            System.out.println("Diminui");
        }
        while(i > -5);

        System.out.println("i = " + i);
    }
}
