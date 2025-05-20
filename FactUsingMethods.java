import java.util.*;
class FactUsingMethods {
    public static int factOfNum(int a){
        int fact = 1;
        for(int i=a;i>=1;i--){
            fact = fact*i;
        }
    return fact;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num= scanner.nextInt();
        
        System.out.println("Factorial of "+num+" is "+ factOfNum(num));
    }
}
