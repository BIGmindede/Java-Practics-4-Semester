package ru.khitrov.prac10.models;

import org.springframework.stereotype.Component;

@Component("junior")
public class Junior implements Programmer {
    public String doCoding() {
        return "junior";
    }
}
