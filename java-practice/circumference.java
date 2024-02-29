import java.util.Scanner;

class Circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int r = sc.nextInt();
        System.out.println("Circumference: " + circum(r));
    }

    public static float circum(int m) {
        return (2 * 3.14f * m);  // Corrected the syntax for multiplication and added a space before 'f'
    }
}

