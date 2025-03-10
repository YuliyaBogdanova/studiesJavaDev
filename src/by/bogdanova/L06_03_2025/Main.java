package by.bogdanova.L06_03_2025;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        final List<Student> students = new ArrayList<>();
        final List<Student> students2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            students.add(StudentFactory.next());
        }
        // Поиск студента
        foundStudent(students,"Дима");
        //System.out.println(foundStudents);

        // Удаление студента
        deleteStudent(students,"Дима");
        System.out.println(students);

        //Добавление студента
        addStudent(students, students2);
        System.out.println(students);

        // Замена студента по индексу
        changeStudent(students, 1, StudentFactory.next());
        System.out.println(students);

        sortArray(students);
        System.out.println(students);

        // сортировка по имени
        sortByComporator(students2, new StudentNameComparator());
        System.out.println(students2);
    }

    // метод сортировки по имение новый, реализованный в StudentNameComparator
    private static void sortByComporator(List<Student> students2, Comparator<Student> comparator) {
        students2.sort(comparator);
    }

    // метод соритровки
    private static void sortArray(List<Student> students) {
        Collections.sort(students);
    }

    // метод нахождения студента по имени
    static Student foundStudent(List<Student> students, String name) {
        for (Student student : students) {
            if (name.equals(student.getName())) {
                return student;
            }
        }
        return null;
    }

    // метод удаления студента по имени
    static void deleteStudent(List<Student> students, String name) {
        Iterator<Student> iterator =students.iterator();
        while (iterator.hasNext()){
            Student nextStudent = iterator.next();
            if (name.equals(nextStudent.getName())) {
                iterator.remove();
            }
        }
    }

    // метод добавления List студентов к другому List студентов
    static void addStudent(List<Student> students1, List<Student> students2) {
        students1.addAll(students2);
    }

    // метод замены студента по индексу
    static void changeStudent(List<Student> students, int index, Student student) {
        if(students.size() < index - 1 || index < 0) {
            return;
        }
        students.set(index, student);
    }

}