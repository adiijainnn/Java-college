import java.util.Scanner;

public class ArmstrongDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check for Armstrong: ");
        int num = sc.nextInt();
        int original = num, result = 0;

        do {
            int digit = num % 10;
            result += digit * digit * digit;
            num /= 10;
        } while (num != 0);

        if (result == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
        sc.close();
    }
}

