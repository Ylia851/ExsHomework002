import java.util.Scanner;

public final class Task01 {
    public static void main(String[] args) {
        EnterNumber();
    }

    public static void EnterNumber() {
        System.out.println("Введите число: ");
        float n;
        try {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextFloat();
            System.out.println(n);

        } catch (Exception e) {
            System.out.println("Exception is" + e);

        }
    }
}