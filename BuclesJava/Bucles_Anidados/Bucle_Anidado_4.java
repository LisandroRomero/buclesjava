import java.util.Scanner;

public class Bucle_Anidado_4 {
    public static void main(String[] args) {
        String abc = "ZYWXVUTSRQPONMLKJIHGFEDCBA";

        for (int i = 0; i < abc.length(); i++) {
                String letras = abc.substring(i, abc.length()-1);
                System.out.println(letras);

        }
    }
}
