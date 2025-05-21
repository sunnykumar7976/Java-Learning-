import java.util.Scanner;

public class FuncToPrintAver {
    
    public static int printAverage(int a, int b, int c){
        int average = (a+b+c)/3;
        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        System.out.println("Enter the third number");
        int c = scanner.nextInt();


        System.out.println("Average of these numbers is : "+ printAverage(a,b,c));

    }
}
