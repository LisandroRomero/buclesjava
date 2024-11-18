import javax.swing.*;

public class Ejercicio_1 {
    public static void main(String[] args) {
        JOptionPane optionPane = new JOptionPane();
        String[] actividades = {"estudiar", "ejercicios", "leer", "tiempo libre"};
        int[] hs = new int[actividades.length];
        int cont = 0;
        int large = actividades.length;
        int max = 0;
        while (cont < large) {
            hs[cont] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas para " + actividades[cont] + ":"));
            System.out.println(hs[cont] + "hs para " + actividades[cont]);
            max += hs[cont];
            cont++;
        }
        System.out.println("Un total de " + max + " horas");
        }
    }
