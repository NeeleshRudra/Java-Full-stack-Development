import java.sql.SQLOutput;
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your length");
        int l = sc.nextInt();
        System.out.println("Enter your breadth");
        int b = sc.nextInt();
        int area = l * b;
        System.out.println("Area of Rectangle is: " +area);
    }
}
