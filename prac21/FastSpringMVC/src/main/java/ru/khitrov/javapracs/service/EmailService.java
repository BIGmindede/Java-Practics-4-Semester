package ru.khitrov.javapracs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import ru.khitrov.javapracs.models.Dog;
import ru.khitrov.javapracs.models.Student;

@Service
public class EmailService {

    @Autowired
    public JavaMailSender emailSender;

    @Async
    public void sendAddStudentEmail(Student student){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("danilmatr05062003@gmail.com");
        message.setTo("matrosovdan@mail.ru");
        message.setSubject("Message from Spring Boot Application");
        message.setText(student.toString());

        emailSender.send(message);
        System.out.println("Email successfully sent!");
    }

    @Async
    public void sendAddDogEmail(Dog dog){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("matrosovdan@mail.ru");
        message.setTo("danilmatr05062003@gmail.com");
        message.setSubject("Message from Spring Boot Application");
        message.setText(dog.toString());

        emailSender.send(message);
        System.out.println("Email successfully sent!");
    }
}