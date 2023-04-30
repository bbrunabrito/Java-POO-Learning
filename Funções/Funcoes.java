package Funções;

public class Funcoes {
    public static void main(String[] args) {
        int resultado = soma(3, 5);
        System.out.println("Soma = " + resultado);

        int[] vetor = {1, 2, 3, 4, 5};
        imprimeVetor(vetor);

        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        imprimeMatriz(matriz);
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static void imprimeVetor(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento " + (i + 1) + " = " + vetor[i]);
        }
    }

    public static void imprimeMatriz(int[][] matriz) {
        System.out.println("Matriz: ");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


}
