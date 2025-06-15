import java.util.Scanner;

public class SecondDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take input
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] freq = new int[10]; // To mark which digits are present

        // Extract digits and mark in array
        while (num > 0) {
            int digit = num % 10;
            freq[digit] = 1;
            num = num / 10;
        }

        // 2nd Smallest
        int count = 0;
        for (int i = 0; i <= 9; i++) {
            if (freq[i] == 1) {
                count++;
                if (count == 2) {
                    System.out.println("2nd Smallest Digit: " + i);
                    break;
                }
            }
        }

        // 2nd Biggest
        count = 0;
        for (int i = 9; i >= 0; i--) {
            if (freq[i] == 1) {
                count++;
                if (count == 2) {
                    System.out.println("2nd Biggest Digit: " + i);
                    break;
                }
            }
        }

        sc.close(); // ✅ close the Scanner
    }
}
