import java.util.Scanner;

public class Bucle_Anidado_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        for (int i = 1; i <= numero; i++) {
            int facto = 1;
            for (int j = 1; j <= i; j++) {
                facto *= j;
            }
            System.out.println("El factorial de: " + i + " es " + facto);
        }
    }
}
