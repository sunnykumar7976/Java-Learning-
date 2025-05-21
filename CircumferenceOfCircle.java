import java.util.*;
public class CircumferenceOfCircle {
    public static double circumOfCircle(double r){
        double c = 3.14 *r*2;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of Radius : ");
        double r = scanner.nextDouble();
        System.out.println("Circumference of the circle is : ");
        circumOfCircle(r);
    }
}
