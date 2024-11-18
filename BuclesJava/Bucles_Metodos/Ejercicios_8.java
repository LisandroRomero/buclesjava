public class Ejercicios_8 {
    public static void main(String[] args) {
        String[] empleados = {"Leandro", "Facundo", "Francisco", "Lucas"};
        int[] horasTrabajadas = {3, 6 ,8, 6};
        calcularPagoSemeanal(empleados, horasTrabajadas);
    }
    public static int calcularPagoSemeanal(String[] name, int[] hs){
        for (int i = 0; i < name.length; i++) {
            System.out.println("Nombre: " + name[i]);
            System.out.println("Pago semanal: $" + hs[i] * 15);
            System.out.println("---------------");
        }
        return 0;
    }
}