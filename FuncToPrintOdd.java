import java.util.Scanner;

public class FuncToPrintOdd {
    public static void printOddNum(int n){
        for(int i=1;i<=n;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n= scanner.nextInt();
        System.out.println("Odd numbers from 1 to " + n);
        printOddNum(n);
    }
    
}
