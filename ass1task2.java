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
                    int rn = Integer.parseInt(rollno);
                    if (rn <= 50) {
                        validCount++;
                    }
                }
            }
        }
         long end=System.nanoTime();
        long diff=end-start;
        System.out.println("speed:" +diff);
        return validCount;
    }
}

