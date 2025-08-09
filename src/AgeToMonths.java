import java.util.Scanner;
public class AgeToMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age in years: ");
        int ageInYears = sc.nextInt();
        int ageInMonths = ageInYears * 12;
        System.out.println("Your age in months is: " + ageInMonths);
        sc.close();
    }
}
