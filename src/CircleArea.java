import java.util.Scanner;
public class CircleArea {
        public static void main(String[] args) {
            double pi=3.14;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the radius of the circle: ");
            double radius = sc.nextDouble();
//            double area = Math.PI * radius * radius;
//            System.out.println("The area of the circle is: " + area);

            double area=pi*radius*radius;
            System.out.print(area);
            sc.close();
        }
    }
