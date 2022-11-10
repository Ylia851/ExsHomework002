public class Task04 {
    public static void main(String[] args) {
        EnterNumber();
    }

    public static void EnterNumber() {
        System.out.println("Введите строку: ");
        String s;
        try {
            Scanner scanner = new Scanner(System.in);
            s = scanner.nextIn(System.out.println(s));

        } catch (RuntimeException e) {
            System.out.println("Введите строку, пустые строки оствлять нельзя");

        }
    }
}
