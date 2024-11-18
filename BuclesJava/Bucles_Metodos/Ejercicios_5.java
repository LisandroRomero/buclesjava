public class Ejercicios_5 {
    public static void main(String[] args) {
        int[] calificaciones = {10, 8, 4, 6 ,3 , 6, 9, 7};

        double promedio = calcularPromedioSatisfaccion(calificaciones);
        System.out.println("La calificacion promedio de los clientes es de: " + promedio);
    }
    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        double sum = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            sum += calificaciones[i];
        };
        return sum/calificaciones.length;
    }
}
