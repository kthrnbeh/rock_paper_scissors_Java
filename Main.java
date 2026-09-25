import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(3);
        System.out.println(number);
    }
}