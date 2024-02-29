class recurssion7 {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int k = countPaths(0, 0, n, m);
        System.out.println(k);
    }

    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 || j == m - 1) {
            return 1;
        }

        // Move down path
        int downPath = countPaths(i + 1, j, n, m);

        // Move right path
        int rightPath = countPaths(i, j + 1, n, m);

        return downPath + rightPath;
    }
}

