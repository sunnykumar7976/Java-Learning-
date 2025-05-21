import java.util.Scanner;

public class Vote {
    public static void eligibleToVote(int age){
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Underage to vote");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scanner.nextInt();

        eligibleToVote(age);
    }


}
