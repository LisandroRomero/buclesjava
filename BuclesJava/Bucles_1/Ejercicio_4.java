import javax.swing.*;

public class Ejercicio_4 {
    public static void main(String[] args) {
        JOptionPane optionPane = new JOptionPane();
        int semana = 7;
        int sum_ventas = 0;
        do {
            int ventas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos a vender: "));
            int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto: "));
            sum_ventas += precio * ventas;
            semana--;
        } while (semana > 0);

        System.out.println("En total se vendió: " + sum_ventas);
    }
}
