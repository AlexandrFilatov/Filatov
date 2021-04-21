import java.util.Random;

public class exercise3 {
    public static void main(String[] args) {
        int[] ar = new int[5];
        Random rnd = new Random();
        int sum = 0;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = rnd.nextInt(30);
        }
        System.out.println("------------");
        for (int i = 0; i < ar.length; i++) {
            System.out.println("ar[" + i + "]=" + ar[i]);
        }

        for (int i = 0; i < ar.length; i++) {

            if (ar[i] % 3 == 0) {
                sum = sum + 1;
            }
        }
        System.out.println("Сумма чисел кратных 3 = " + sum);
    }
}
