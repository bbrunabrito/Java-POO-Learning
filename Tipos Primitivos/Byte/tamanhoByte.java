public class tamanhoByte {
    public static void main(String[] args){
        byte i = 127;
        System.out.println("Valor de i = " + i);
        i++;

        System.out.println("Valor de i + 1 = " + i);
        i++;

        System.out.println("Valor de i + 2 = " + i);
    }    
}
 /* Como o tipo byte é um tipo de dados com sinal, seu valor 
 máximo é 127 e o seu mínimo é -128. 
    Então quando incrementamos 127 ele volta ao valor mínimo.
    E quando incrementamos novamente, passa de -128 para -127.
 */