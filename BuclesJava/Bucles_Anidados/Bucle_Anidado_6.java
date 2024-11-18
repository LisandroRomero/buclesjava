import java.util.Scanner;

public class Bucle_Anidado_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elija la cantidad deseada: ");
        int cantidad = scanner.nextInt();

        System.out.println("Ingrese los números:");
        for (int i = 0; i < cantidad; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " es primo");
            }
        }

        scanner.close();
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
