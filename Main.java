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

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Exit");
            System.out.print("Enter Choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
            }

        } while (choice != 2);
    }
}
