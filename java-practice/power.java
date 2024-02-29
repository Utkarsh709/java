import java.util.Scanner;

 class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int x = sc.nextInt();

        System.out.println("Enter a power:");
        int n = sc.nextInt();

        double k = Math.pow(x, n);

        System.out.println("Result: " + k);
    }
}

