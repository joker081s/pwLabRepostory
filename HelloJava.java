public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        pattern();
    }

    public static void pattern() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}