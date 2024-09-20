
package asm6;

import java.util.ArrayList;

public class StudentList {

    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {

        studentList.add(student);

    }
    public void updateStudentById(String id, Student newStudentData) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.set(i, newStudentData);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public Student findStudentById(String id) {

        for (Student student : studentList) {

            if (student.getId().equals(id)) {

                return student;

            }

        }

        return null;

    }

    

    public void deleteStudentById(String id) {

        studentList.removeIf(student -> student.getId().equals(id));

    }

    public void displayAllStudents() {

        for (Student student : studentList) {

            student.displayInfo();

            System.out.println("- -");

        }

    }

    public Student findTopStudent() {

        if (studentList.isEmpty()) {

            return null;

        }

         Student topStudent = studentList.get(0);

        for (Student student : studentList) {

            if (student.getGpa() > topStudent.getGpa()) {

                topStudent

                        = student;

            }

        }

        return topStudent;

    }
}
