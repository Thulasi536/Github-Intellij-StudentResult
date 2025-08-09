import java.util.Scanner;
public class USDToINR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in USD: ");
        double usd = sc.nextDouble();
        double rate = 83.5;
        double inr = usd * rate;
        System.out.println("Amount in INR: " + inr);
    }
}