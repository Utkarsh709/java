public class OuterClass1 {

    private int outerField;

    public OuterClass1(int value) {
        this.outerField = value;
    }

    // Inner class
    public class InnerClass {

        public void display() {
            System.out.println("InnerClass display method");
            System.out.println("OuterField value from InnerClass: " + outerField);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of OuterClass1
        OuterClass1 outerObj = new OuterClass1(20);

        // Creating an instance of InnerClass using the outer object
        InnerClass innerObj = outerObj.new InnerClass();

        // Calling the display method of InnerClass
        innerObj.display();
    }
}

