import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void addStudent() {

        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Marks: ");
        double marks = input.nextDouble();
        input.nextLine();

        students.add(new Student(id, name, marks));

        System.out.println("Student Added Successfully!");
    }

    public static void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void searchStudent() {

        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        boolean found = false;

        for (Student student : students) {
            if (student.getStudentId().equals(id)) {
                System.out.println(student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }
    }

    public static void calculateAverage() {

        if (students.isEmpty()) {
            System.out.println("No Students Available");
            return;
        }

        double total = 0;

        for (Student student : students) {
            total += student.getMarks();
        }

        double average = total / students.size();

        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Calculate Average");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    calculateAverage();
                    break;
            }

        } while (choice != 5);
    }
}
