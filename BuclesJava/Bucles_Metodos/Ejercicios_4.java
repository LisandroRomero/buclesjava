import javax.swing.*;

public class Ejercicios_4 {
    public static void main(String[] args) {
        // Crea un arreglo `clientes` y otro `compras` que almacene la cantidad de compras de cada cliente.
        // Escribe una función `calcularDescuentos` que recorra el arreglo y aplique
        // el descuento a los clientes que califiquen
        String[] clientes = {"Aixa", "Leandro", "Luciana", "Cinthia"};
        int[] compras = {5, 10, 15, 20};
        int[] total = {500, 1000, 1500, 2000};
        calcularDescuentos(clientes, compras, total);
    }
    public static void calcularDescuentos(String[] clientes, int[] compras, int[] total) {
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                System.out.println(clientes[i] + " Obtiene un descuento del 10%!!");
                System.out.println("Por su compra de " + total[i] + " solo paga " + (total[i] * 0.90));
            }
        }
    }
}
