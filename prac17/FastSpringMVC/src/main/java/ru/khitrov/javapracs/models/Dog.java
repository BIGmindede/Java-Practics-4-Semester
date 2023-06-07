package ru.khitrov.javapracs.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "dog")
@Entity
@Getter
@Setter
public class Dog {
    @Id
    private int id;
    private String name;
    private String breed;

    @JsonIgnore
    @ManyToOne
    public Student student;
}