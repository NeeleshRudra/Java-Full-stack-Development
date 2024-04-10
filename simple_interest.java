import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        System.out.println("Calculation of simple interest");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        float principal = sc.nextFloat();
        System.out.println("Enter the rate: ");
        float rate = sc.nextFloat();
        System.out.println("Enter the time period: ");
        float period = sc.nextFloat();
        float Si = (principal * rate  * period)/100;
        System.out.println("Here is your simple interest: " +Si);

    }
}
