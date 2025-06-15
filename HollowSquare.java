import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square: ");
        int n = sc.nextInt();

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for each column
            for (int j = 1; j <= n; j++) {
                // Print * at borders only
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // inner space
                }
            }
            System.out.println(); // go to next line
        }

        sc.close(); // close scanner
    }
}
