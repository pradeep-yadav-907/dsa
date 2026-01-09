import java.util.*;

public class casting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Original float value
        float a = 25.23f;

        // Casting float to int
        int b = (int) a;

        // Display the result
        System.out.println("The original float value: " + a);
        System.out.println("The integer value after casting: " + b);

        sc.close(); // Scanner को बंद करना
    }
}
