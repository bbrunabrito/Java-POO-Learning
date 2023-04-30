package String;

public class TesteString {
    public static void main(String [] args) {
        String minhaString = "exemplo";
        System.out.println(minhaString);
       
        // char[] vetorString = minhaString.toCharArray(); //converte a string em um vetor de caracteres

        char[] outraString = {'b', 'r', 'u', 'n', 'a'}; //outra forma de declarar uma string
        String s = new String(outraString);
        System.out.println(s);
    }
}
