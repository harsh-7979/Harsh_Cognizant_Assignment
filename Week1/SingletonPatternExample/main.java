public class main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if (logger1 == logger2) {
            System.out.println("Verified Both logger instances are the same");
        } else {
            System.out.println("verification failed both instance are different");
        }
    }
}
