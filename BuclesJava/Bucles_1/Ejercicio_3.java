import javax.swing.*;

public class Ejercicio_3 {
    public static void main(String[] args) {
        JOptionPane optionPane = new JOptionPane();
        int products = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos: "));

        for (int i = 0; i < products; i++) {
            int cant = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos N° " + (i + 1) + " posee?"));
            if (cant < 5){
                System.out.println("hay que realizar un pedido del producto numero " + (i + 1));
            } else {
                System.out.println("El producto N° " + (i + 1) + " tiene suficiente stock");
            }
        }
    }
}
