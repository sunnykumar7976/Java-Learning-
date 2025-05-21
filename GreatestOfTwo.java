import java.util.Scanner;

public class GreatestOfTwo {
    public static void greatestOfTwo(int a, int b){
        if(a>b){
            System.out.println("A is greater");
        }
        else if(b>a){
            System.out.println("B is Greater");
        }
        else{
            System.out.println("Numbers are equal");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of B: ");
        int b = scanner.nextInt();

        greatestOfTwo(a,b);

    }
}
