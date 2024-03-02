import java.util.Scanner;

public class Factorsofnum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        System.out.println("Factors of " + number + " are:");
        findFactors(number);
        scan.close();
    }

    public static void findFactors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
