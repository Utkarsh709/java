import java.util.Scanner;

class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        eligible(age);
        System.out.println("Bye");
    }

    public static void eligible(int age) {
        if (age > 18) {
            System.out.println("You are eligible");
        } else {
            System.out.println("You are not eligible");
        }
    }
}

