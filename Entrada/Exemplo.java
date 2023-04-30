package Entrada;
import java.util.Scanner;

public class Exemplo {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String minhaString = scanner.nextLine();
        System.out.println("A string digitada foi: " + minhaString);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        scanner.close();
        System.out.println("O número digitado foi: " + num);        
    }
}
