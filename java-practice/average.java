import java.util.Scanner;

class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number:");
        int a = sc.nextInt();
        System.out.println("enter a second number:");
        int b = sc.nextInt();
        System.out.println("enter a third number:");
        int c = sc.nextInt();
        int avg = calculateAverage(a, b, c);
        System.out.println("average is:" + avg);
    }

    public static int calculateAverage(int m, int n, int p) {
        int k = (m + n + p) / 3; // Fixed the average calculation, changed '/2' to '/3'
        return k;
    }
}

