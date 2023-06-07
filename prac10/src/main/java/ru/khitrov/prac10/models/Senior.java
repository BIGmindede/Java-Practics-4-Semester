package ru.khitrov.prac10.models;

import org.springframework.stereotype.Component;

@Component("senior")
public class Senior implements Programmer {
    public String doCoding() {
        return "senior";
    }
}