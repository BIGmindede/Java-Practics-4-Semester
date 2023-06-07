package ru.khitrov.javaprecs.prac14.models;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
@NoArgsConstructor
public class Student {

    private String firstName;
    private String lastName;
    private String middleName;

    private static List<Student> people = new ArrayList<>();

    public Student(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public void addStudentinlist(Student student) {
        people.add(student);
    }

    public void deleteStudent(String firstName) {
        people.removeIf(student -> Objects.equals(student.getFirstName(), firstName));
    }

    public void fillArray() {
        if (people.size() == 0) {
            people.add(new Student("Khitrov", "Niktia2", "Young"));
            people.add(new Student("Khitrov", "Niktia3", "Antonovih"));
            people.add(new Student("Khitrov", "Niktia4", "Petrovich"));
            people.add(new Student("Khitrov", "Nikita", "Sergeevich"));
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }

    public List<Student> getPeople() {
        return people;
    }

    public void setPeople(List<Student> people) {
        this.people = people;
    }
}
