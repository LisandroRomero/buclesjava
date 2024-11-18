import java.util.Scanner;

public class Bucle_Anidado_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sum = 0;
        int numero = entrada.nextInt();
        for (int i = 1; i <= numero; i++) {
            int facto = 1;
            for (int j = 1; j <= i; j++) {
                facto *= j;
            }
            System.out.println("El factorial de: " + i + " es " + facto);
            sum += facto;
        }
        System.out.println("La suma de estos factoriales es: " + sum);
    }
}
