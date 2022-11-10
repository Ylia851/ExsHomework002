public class Task02 {
    public static void main(String[] args) {
        newArray();
    }

    public static void newArray() {
        int[] arr = new int[8];
        int d = 0;
        try {
            // ? деление массива на число?
            double catchedRes1 = arr / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
