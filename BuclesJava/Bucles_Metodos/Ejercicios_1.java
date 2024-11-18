import javax.swing.*;

public class Ejercicios_1 {
    public static void main(String[] args) {
        int[] ventas = new int[5];
        for (int i = 0; i < 5 ; i++ ) {
            ventas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas del dia " + (i + 1) + ": "));
        }

        System.out.println("El ingreso mensual fue de: " + calcularIngresosMensuales(ventas));
        }

        static int calcularIngresosMensuales(int[] ventas) {
        int total = 0;
        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];
        }
        return total;
        }
    }
