class SY2022BIT031 {
    public static void main(String[] args) {
        String[] registrations = {"2022BIT031", "2022BCS031", "2022BME031", "2022BCE031", "2022BCV031"};
        int validCount = getValidRegistrationCountLE50Approach1(registrations);
        System.out.println("Valid registrations count : " + validCount);
    }

    public static int getValidRegistrationCountLE50Approach1(String[] registrations) {
        long start=System.nanoTime();
        int validCount = 0;
        for (int k = 0; k < registrations.length; k++) {
            String yearString = registrations[k].substring(0, 4);
            int year = Integer.parseInt(yearString);
            if (year >= 2000 && year <= 2024) {
                String department = registrations[k].substring(4, 7);
                if (department.equals("BCS") || department.equals("BIT") || department.equals("BME") || department.equals("BCE")) {
                    String rollno = registrations[k].substring(7, 10);
                    String zero="000";
                    String max="050";
                    int m = zero.hashCode();
                    int n = max.hashCode();
                    int f = rollno.hashCode();
                    if (f>m && f<=n) {
                        validCount++;
                    }
                }
            }
        }
        long end=System.nanoTime();
        long eclapsed=end-start;
        System.out.println("speed:" + eclapsed + "nanoseconds");
        return validCount;
    }
}

