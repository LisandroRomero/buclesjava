public class Numero_perfecto {
    public static void main(String[] args) {
        int limite = 1000;

        for (int i = 1; i < limite + 1; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0){
                    sum += j;
                }
            }
            if (sum == i){
                System.out.println(i);
            }

        }

    }
}
