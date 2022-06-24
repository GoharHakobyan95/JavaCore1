package homework.student;

public class StudentStorage {
    private Student[] array = new Student[10];
    private int size = 0;

    public void add(Student student) {
        if (size == array.length) {
            extend();
        }
        array[size++] = student;
    }

    private void extend() {
        Student[] temp = new Student[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "." + array[i] + " ");
        }
    }

    public int getSize() {
        return size;
    }

    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[index] = array[index + 1];
            }
            size--;
            System.out.println("Student deleted");
        } else {
            System.out.println("Index out of bound");
        }
    }

    public void printStudentsByLesson(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getLesson().equals(lessonName)) {
                System.out.println(array[i]);
            }
        }
    }


    public void change(int index, String newLesson) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[i].setLesson(newLesson);
                newLesson.equals(array[i]);
            }
            System.out.println("Lesson name changed");
        } else {
            System.out.println("Index out of bound");
        }
    }

}




























