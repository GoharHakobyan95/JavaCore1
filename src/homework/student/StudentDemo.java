package homework.student;

import java.util.Scanner;

public class StudentDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        studentStorage.add(new Student("Poghos", "Pogosyan", 25, "077077077", "Gyumri", "Java"));
        studentStorage.add(new Student("Petros", "Petrosyan", 35, "094094094", "Gyumri", "MySql"));
        studentStorage.add(new Student("Martiros", "Martirosyan", 18, "098098098", "Gyumri", "JavaScript"));
        boolean run = true;
        while (run) {
            System.out.println("Please input " + Commands.EXIT + " for exit");
            System.out.println("Please input " + Commands.ADD_STUDENT + " for add student");
            System.out.println("Please input " + Commands.PRINT_ALL_STUDENTS + " for print all students");
            System.out.println("Please input " + Commands.PRINT_STUDENTS_COUNT + " for print student count");
            System.out.println("Please input " + Commands.DELETE_STUDENT_BY_INDEX + " for  delete student by index");
            System.out.println("Please input " + Commands.PRINT_STUDENTS_BY_LESSON + "  for  print student by lesson");
            System.out.println("Please input " + Commands.CHANGE_STUDENT_LESSON + " for  change student's lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case Commands.EXIT:
                    run = false;
                    break;
                case Commands.ADD_STUDENT:
                    addStudent();
                    break;
                case Commands.PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case Commands.PRINT_STUDENTS_COUNT:
                    System.out.println(studentStorage.getSize());
                case Commands.DELETE_STUDENT_BY_INDEX:
                    deleteStudent();
                    break;
                case Commands.PRINT_STUDENTS_BY_LESSON:
                    studentsByLesson();
                    break;
                case Commands.CHANGE_STUDENT_LESSON:
                    changeStudentLesson();
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
        System.out.println("Please input student phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student city");
        String city = scanner.nextLine();
        System.out.println("Please input student lesson");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);
        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("Thank you, student added");
    }

    private static void deleteStudent() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.delete(index);
    }

    private static void studentsByLesson() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLesson(lessonName);
    }

    private static void changeStudentLesson() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int studentIndex = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(studentIndex);
        if (student != null) {
            System.out.println("Please input new lesson");
            String newLessonName = scanner.nextLine();
            if (newLessonName != null && !newLessonName.trim().equals("")) {
                student.setLesson(newLessonName.trim());
                System.out.println("Lesson changed for student " + student.getName() + " " + student.getSurname());
            } else {
                System.out.println("Indvalid index, please try again!");
                changeStudentLesson();
            }
        }
    }
}