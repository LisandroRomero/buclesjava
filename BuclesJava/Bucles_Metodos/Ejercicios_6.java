public class Ejercicios_6 {
    public static void main(String[] args) {
        int[] facturas = {100, 200, 300, 400, 500};
        double impuestos = calcularImpuesto(facturas);
        System.out.println("Total de facturas con impuestos: " + impuestos);
    }
    public static double calcularImpuesto(int[] facturas) {
        double suma = 0;
        for (int i = 0; i < facturas.length; i++) {
            suma += facturas[i] * 1.21;
        }
        return suma;
    }
}
