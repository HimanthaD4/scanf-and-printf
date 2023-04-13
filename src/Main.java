import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your marks");
        int n1 = sc.nextInt();

        System.out.println("enter your marks");
        int n2 = sc.nextInt();

        int total = n1+ n2;

        System.out.println("total is "+total);

    }
}