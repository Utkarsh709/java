import java.util.Scanner;

class Student {
    String name;
    int age;
    int rollno;
    String address;
    String subject1;
    String subject2;
    String subject3;
    String subject4;
    String subject5;
    int k, l, m, r, o;
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Enter the data of student " + (i + 1) + ":");
            System.out.println("Enter name:");
            students[i].name = scanner.next();
            System.out.println("Enter age:");
            students[i].age = scanner.nextInt();
            System.out.println("Enter roll number:");
            students[i].rollno = scanner.nextInt();
            System.out.println("Enter address:");
            scanner.nextLine(); // Consume newline character
            students[i].address = scanner.nextLine();
            System.out.println("Enter subject1:");
            students[i].subject1 = scanner.next();
            System.out.println("Enter marks for subject1:");
            students[i].k = scanner.nextInt();
            System.out.println("Enter subject2:");
            students[i].subject2 = scanner.next();
            System.out.println("Enter marks for subject2:");
            students[i].l = scanner.nextInt();
            System.out.println("Enter subject3:");
            students[i].subject3 = scanner.next();
            System.out.println("Enter marks for subject3:");
            students[i].m = scanner.nextInt();
            System.out.println("Enter subject4:");
            students[i].subject4 = scanner.next();
            System.out.println("Enter marks for subject4:");
            students[i].r = scanner.nextInt();
            System.out.println("Enter subject5:");
            students[i].subject5 = scanner.next();
            System.out.println("Enter marks for subject5:");
            students[i].o = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            Student currentStudent = students[i];
            System.out.println("Details of student " + (i + 1) + ":");
            System.out.println("Name: " + currentStudent.name);
            System.out.println("Age: " + currentStudent.age);
            System.out.println("Roll Number: " + currentStudent.rollno);
            System.out.println("Address: " + currentStudent.address);
            System.out.println("Subject1: " + currentStudent.subject1 + ", Marks: " + currentStudent.k);
            System.out.println("Subject2: " + currentStudent.subject2 + ", Marks: " + currentStudent.l);
            System.out.println("Subject3: " + currentStudent.subject3 + ", Marks: " + currentStudent.m);
            System.out.println("Subject4: " + currentStudent.subject4 + ", Marks: " + currentStudent.r);
            System.out.println("Subject5: " + currentStudent.subject5 + ", Marks: " + currentStudent.o);
        }
    }
}

