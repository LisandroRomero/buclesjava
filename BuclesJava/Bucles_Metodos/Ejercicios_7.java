public class Ejercicios_7 {
    public static void main(String[] args) {
        int[] compras = {300, 650, 450, 550, 600};
        int descuentos = aplicarDescuento(compras);
        System.out.println("el total de las compras con sus descuentos es de: " + descuentos);
    }

    public static int aplicarDescuento(int[] compras) {
        int sum = 0;
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                sum += compras[i] * 0.85;
            } else {
                sum += compras[i];
            }
        }
        return sum;
    }
}