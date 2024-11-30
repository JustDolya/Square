import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[10000];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(100);
        }

        int max = 0;
        int max10 = 0; // Переменная для хранения максимального элемента на расстоянии >= 10

        for (int i = 10; i < mass.length; i++) {
            max10 = Math.max(max10, mass[i - 10]);
            int sum = mass[i] * mass[i] + max10 * max10;
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println("Максимальная сумма квадратов: " + max);
    }
}