package edu.miu.cs.cs425.lab9.eregistrarwebapi.model;

import edu.miu.cs.cs425.lab9.eregistrarwebapi.model.Student;

import java.util.List;

public class StudentList {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
