import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ədədi daxil edin: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Mənfi ədədlərin faktorialı yoxdur.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }
        
        scanner.close();
    }
}