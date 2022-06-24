package homework.student;

import java.util.Scanner;

public class StudentDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add student");
            System.out.println("Please input 2 for print all students");
            System.out.println("Please input 3 for print student count");
            System.out.println("Please input 4 for  delete student by index");
            System.out.println("Please input 5 for  print student by lesson");
            System.out.println("Please input 6 for  change student's lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorage.print();
                    break;
                case 3:
                    System.out.println(studentStorage.getSize());
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    studentsByLesson();
                case 6:
                    changeLesson();
                    break;
                default:
                    System.out.println("Invalid command, please try again.");
                    break;
            }
        }
    }

    private static void addStudent() {
        System.out.println("Please input student name");
        String name = scanner.nextLine();
        System.out.println("Please input student surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student age");
        String ageStr = scanner.nextLine();
        System.out.println("Please input student phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student city");
        String city = scanner.nextLine();
        System.out.println("Please input student lesson");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);
        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("Thank you, Student added");
    }

    private static void deleteStudent() {
        studentStorage.print();
        System.out.println("Please Choose Student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.delete(index);
    }

    private static void studentsByLesson() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLesson(lessonName);
    }


    private static void changeLesson() {
        studentStorage.print();
        System.out.println("Please Choose Student index");
        int studentIndex = Integer.parseInt(scanner.nextLine());
        System.out.println("Please Choose new lesson");
        String newLessonName = scanner.nextLine();
        studentStorage.change(studentIndex, newLessonName);
    }
}