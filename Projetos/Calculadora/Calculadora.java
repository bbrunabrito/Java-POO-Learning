package Projetos.Calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y;
        char op;

        System.out.print("Digite um número: ");
        x = scanner.nextDouble();
        
        System.out.print("Digite um operador: ");
        op = scanner.next().charAt(0);

        System.out.print("Digite outro número: ");
        y = scanner.nextDouble();

        scanner.close();

        switch(op) {
            case '+':
                System.out.println(x + " " + op + " " + y + " = " + (x + y));
                break;
            case '-':
                System.out.println(x + " " + op + " " + y + " = " + (x - y));
                break;
            case '*':
                System.out.println(x + " " + op + " " + y + " = " + (x * y));
                break;
            case '/':
                if(y == 0) System.out.println("Não é possível dividir com 0");
                else System.out.println(x + " " + op + " " + y + " = " + (x / y));
                break;
            case '%':
                System.out.println(x + " " + op + " " + y + " = " + ((int)x % (int)y));
                break;
            default:
                System.out.println("Operador inválido");
                break;
        }

    }
}
