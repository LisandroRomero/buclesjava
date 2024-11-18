import javax.swing.*;

public class Ejercicio_5 {
    public static void main(String[] args) {
        JOptionPane optionPane = new JOptionPane();
        int empleados = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados")));
        int maxHoras = 40;
        int numEmpleado = 0;
        int diasLaborales = 6;
        for (int i = 0; i < empleados; i++) {
            numEmpleado += 1;
            int horas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas trabajó el dia "+ (i + 1) + " el empleado numero " + (i+1)));
            if (horas > 0 && horas < 40) {
                JOptionPane.showMessageDialog(null,"El empleado " + numEmpleado + " no trabajó de más");
            } else if (horas > 40) {
                JOptionPane.showMessageDialog(null, "El empledo " + numEmpleado + " hizo " + (horas - 40) + " horas extras");
            } else {
                JOptionPane.showMessageDialog(null, "Valor invalido");
            }


        }



    }
}
