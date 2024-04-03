public class OuterClass {
    
    private int outerField = 10;
    
    // Inner class
    class InnerClass {
        
        public void display() {
            System.out.println("InnerClass display method");
            System.out.println("OuterField value from InnerClass: " + outerField);
        }
    }
    
    public static void main(String[] args) {
        // Creating an instance of OuterClass
        OuterClass outerObj = new OuterClass();
        
        // Creating an instance of InnerClass using the outer object
        InnerClass innerObj = outerObj.new InnerClass();
        
        // Calling the display method of InnerClass
        innerObj.display();
    }
}

