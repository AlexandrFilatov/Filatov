import java.util.Scanner;

public class exercise2 {

    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String name1 = "Вячеслав";

        if (name.equals(name1)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
