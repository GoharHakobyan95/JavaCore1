package homework.students;

import chapters.chapter8.D;
import homework.students.command.Commands;
import homework.students.model.Lesson;
import homework.students.storage.LessonStorage;
import homework.students.storage.StudentStorage;
import homework.students.model.Student;

import java.util.Scanner;

public class StudentDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();


    public static void main(String[] args) {

        Lesson java = new Lesson("Java", "Teacher 1 ", 7, 35);
        lessonStorage.add(java);
        Lesson javaScript = new Lesson("Java Script", "Teacher 2 ", 6, 30);
        lessonStorage.add(javaScript);
        Lesson english = new Lesson("English", "Teacher 3 ", 3, 20);
        lessonStorage.add(english);

        studentStorage.add(new Student("Poghos", "Pogosyan", 25, "077077077", "Gyumri", java));
        studentStorage.add(new Student("Petros", "Petrosyan", 35, "094094094", "Gyumri", javaScript));
        studentStorage.add(new Student("Martiros", "Martirosyan", 18, "098098098", "Gyumri", english));

        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_COUNT:
                    System.out.println(studentStorage.getSize());
                case Commands.DELETE_STUDENT_BY_INDEX:
                    deleteStudent();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    studentsByLesson();
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLesson();
                    break;
                case ADD_LESSON:
                    addLesson();
                    changeStudentLesson();
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command, please try again.");
                    break;
            }
        }
    }

    private static void addLesson() {
        System.out.println("Please input lesson name ");
        String name = scanner.nextLine();

        System.out.println("Please input lesson price ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Please input lesson teacher name ");
        String teacherName = scanner.nextLine();

        System.out.println("Please input lesson duration by month ");
        int duration = Integer.parseInt(scanner.nextLine());

        Lesson lesson = new Lesson(name, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("Lesson created!!! ");

    }

    private static void addStudent() {
        if (lessonStorage.getSize() == 0) {
            System.out.println("Please add lesson");
            addLesson();
        } else {
            lessonStorage.print();
            System.out.println("Please choose lesson index");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
            if (lesson == null) {
                System.out.println("Please input correct index ");
                addStudent();
            } else {
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

                int age = Integer.parseInt(ageStr);
                Student student = new Student(name, surname, age, phoneNumber, city, lesson);
                studentStorage.add(student);
                System.out.println("Thank you, Student  was added");
            }
        }
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
            lessonStorage.print();
            System.out.println("Please input lesson index");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
            if (lesson == null) {
                System.out.println(" Please input correct index ");
                changeStudentLesson();
            } else {
                student.setLesson(lesson);
                System.out.println("Lesson was changed! ");
            }

        }
    }
}
