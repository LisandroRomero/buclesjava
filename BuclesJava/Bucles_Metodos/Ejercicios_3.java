public class Ejercicios_3 {
    public static void main(String[] args) {
        //- Crea un arreglo `clientes` que almacene los nombres de los clientes y
        // un arreglo `facturasPendientes` con el monto de sus facturas pendientes.
        //- Escribe una función `enviarFacturas` que imprima los nombres de los clientes con facturas mayores a $500.
        String[] nombres = {"Aixa", "Leandro", "Luciana", "Cinthia"};
        int[] facturas = {200, 400, 600, 800};

        enviarFacturas(nombres, facturas);
    }
    public static void enviarFacturas(String[] nombres, int[] facturas) {
        for (int i = 0; i < facturas.length; i++) {
            if (facturas[i] < 500) {
                System.out.println(nombres[i] + " - Factura pendiente: " + facturas[i]);
            }
        }
    }
}
