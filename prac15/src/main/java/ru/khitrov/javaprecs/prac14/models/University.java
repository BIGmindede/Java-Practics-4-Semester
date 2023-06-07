package ru.khitrov.javaprecs.prac14.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
@Entity
@Getter
@Setter
@Table(name = "university")
@NoArgsConstructor
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "creation_date")
    private String creationDate;

    public University(String name, String creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }
}
