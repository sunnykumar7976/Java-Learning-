import java.util.Scanner;

public class FactorialUsingDoWHile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want factorial of : ");
        int num = scanner.nextInt();
        int result=1;
        int copy = num;
        do{
           result = result*num;
           num--;
        }while(num>1);
        System.out.println("Factorial of "+copy+" is "+result);
    }
}
