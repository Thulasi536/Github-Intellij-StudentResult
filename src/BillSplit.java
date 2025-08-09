import java.util.Scanner;
public class BillSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total bill amount: ");
        int totalBill = sc.nextInt();
        System.out.print("Enter number of persons: ");
        int persons = sc.nextInt();
        int individualAmount = totalBill / persons; // Integer division
        int moneyLeft = totalBill % persons;        // Remainder
        System.out.println("Each person should pay: " + individualAmount);
        System.out.println("Money left: " + moneyLeft);
    }
}
