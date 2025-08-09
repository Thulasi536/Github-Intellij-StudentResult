import java.util.Scanner;
public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age:");
        int age = sc.nextInt();
        System.out.print("Enter Class:");
        String StudentClass=sc.next();
        System.out.print("Enter Gender:");
        String gender=sc.next();
        System.out.print("Enter marks for subject 1: ");
        double sub1 = sc.nextDouble();
        System.out.print("Enter marks for subject 2: ");
        double sub2 = sc.nextDouble();
        System.out.print("Enter marks for subject 3: ");
        double sub3 = sc.nextDouble();
        double total = sub1 + sub2 + sub3;
        double average = total / 300;
        double percentage = (total / 300) * 100;
        String result = (percentage >= 35) ? "Pass" : "Fail";
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
        System.out.println("Class:" + StudentClass);
        System.out.println("Gender:" + gender);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
        sc.close();
    }
}
