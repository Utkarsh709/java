public class SY2022bit031 {
    public void task1(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public int task2(int a[]) {
        return a[0];
    }
    public int task3(int a[]) {
      return a[a.length-1];
    }
    public int task4(int a[]) {
        return a[a.length - 2];
    }
     public int task5(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
      public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};
        SY2022bit031 sy = new SY2022bit031();
        sy.task1(a);
        System.out.println( sy.task2(a));
        System.out.println(sy.task3(a));
        System.out.println(sy.task4(a));
        System.out.println(sy.task5(a));
    }
}

