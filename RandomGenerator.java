import java.util.Arrays;

public class RandomGenerator {
    public static void main(String[] args) {    
        RandomGenerator r1 = new RandomGenerator();
        String a[] = new String[10000];
         r1.firstfour(a);
        printData(a);
        long m = System.nanoTime();
        r1.midthree(a);
        r1.lastThree(a);
        long n = System.nanoTime();
        long duration = n- m;
        System.out.println("Time taken to generate numbers using nanoTime() method: " + duration);
    }
    
    public static void firstFour(String[] a) {
        long nanoTime = System.nanoTime();
        for (int i = 0; i < a.length; i++) {
            a[i] = String.valueOf((nanoTime % 9999) + 1);
            a[i] = String.format("%04d", Integer.parseInt(a[i]));
            nanoTime += 13;
        }
        midthree-(a);
        lastThree(a);
        printData(a);
    }

    public static void midthree(String a[]) {
        long nanoTime = System.nanoTime();
        for (int i = 0; i < a.length; i++) {
            String s = "";
            for (int j = 0; j < 3; j++) {
                s = s + String.valueOf((char) ((nanoTime % 10) + 'a'));
                nanoTime += 13;
            }
            a[i] = a[i] + s;
            nanoTime += 13;
        }
    }

    public static void lastThree(String a[]) {
        long nanoTime = System.nanoTime();
        for (int i = 0; i < a.length; i++) {
            String s1 = "";
            for (int j = 0; j < 3; j++) {
                s1 = String.valueOf((nanoTime % 999) + 1);
                s1 = String.format("%03d", Integer.parseInt(s1));
                nanoTime += 13;
            }
            a[i] = a[i] + s1;
            nanoTime += 13;
        }
    }

    public static void printData(String[] a) {
        System.out.println(Arrays.toString(a));
    }
}

