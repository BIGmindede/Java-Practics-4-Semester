package ru.khitrov.javaprecs.prac14.models;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
@NoArgsConstructor
public class University {

    private String name;
    private String creationDate;

    private static List<University> universities= new ArrayList<>();



    public void addUniversityInList(University university) {
        universities.add(university);
    }

    public void deleteUniversity(String name) {
        universities.removeIf(student -> Objects.equals(student.getName(), name));
    }

    public void fillArray() {
        if (universities.size() == 0) {
            universities.add(new University("MGU", "03.08.1956"));
            universities.add(new University("MFTI", "06.10.1970"));
            universities.add(new University("MIREA", "01.02.1975"));
            universities.add(new University("HSE", "11.11.1964"));
        }
    }

    public University(String name, String creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public static List<University> getUniversities() {
        return universities;
    }

    public static void setUniversities(List<University> universities) {
        University.universities = universities;
    }
}
