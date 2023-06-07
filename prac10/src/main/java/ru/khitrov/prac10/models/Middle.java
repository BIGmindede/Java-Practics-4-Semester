package ru.khitrov.prac10.models;

import org.springframework.stereotype.Component;

@Component("middle")
public class Middle implements Programmer {
    public String doCoding() {
        return "middle";
    }
}