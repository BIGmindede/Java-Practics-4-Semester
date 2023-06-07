package ru.khitrov.prac10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.khitrov.prac10.config.BeanConfig;
import ru.khitrov.prac10.models.ConcreteProgrammer;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        ConcreteProgrammer concreteProgrammer = context.getBean(ConcreteProgrammer.class);
        concreteProgrammer.goCode();
    }
}
