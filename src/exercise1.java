import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        System.out.print("Введите чисело: ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        if (l > 7) {
            System.out.println("Привет");
        } else {
            System.out.println(" ");
        }
    }
}
