package Estruturas.Selecao;

public class ESelecao {
    public static void main (String [] args) {
        int a = 23;
        int b = 10;
        boolean x;

        if(a > b) x = true;
        else x = false;

        System.out.println("X = " + x);
        
        int choice = 2;

        switch(choice) {
            case 1:
                System.out.println("Choice = " + choice);
                break;
            case 2:
                System.out.println("Escolhi outro");
                break;
            default:
                System.out.println("Escolhi nada");
                break;
        }
    }   
}
