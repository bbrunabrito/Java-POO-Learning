package Vetores;

public class Vetor {
    public static void main (String [] args) {
        int[] numeros = new int[6];
        int soma = 0;
        
        for(int i = 0; i < 6; i++) {
            numeros[i] = i * 2;
            System.out.print("numeros[" + i + "] = " + numeros[i] + ", ");
        }
        System.out.println("");

        for(int j = 0; j < 6; j++){
            soma += numeros[j];
        }
    
        System.out.println("Soma = " + soma);
    }
}
