package ru.khitrov.prac10.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConcreteProgrammer {
    private Programmer programmer;

    @Autowired
    public ConcreteProgrammer(@Qualifier("junior") Programmer programmer) {
        this.programmer = programmer;
    }

    public void goCode() {
        System.out.println("I'm " + programmer.doCoding() + " programmer");
    }
}
