import javax.swing.*;

public class Ejercicio_2 {
    public static void main(String[] args) {
        JOptionPane optionPane = new JOptionPane();
        int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados:"));
        //int[] Nro_empleado = new int[empleados];
        int Nro_empleado = 0;
        while (empleados > 0) {

            Nro_empleado += 1;
            int hs = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas del empleado Nro°" + Nro_empleado + ":"));
            int tarifa = 15;
            double sueldo = hs * tarifa;
            System.out.println("El empleado N°" + Nro_empleado + " cobrará " + sueldo);

            empleados -= 1;
        }
    }
}
