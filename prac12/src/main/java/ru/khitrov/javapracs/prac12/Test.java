package ru.khitrov.javapracs.prac12;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

@Component
public class Test {

    @PostConstruct
    public String testPostConstruct() throws IOException {

        String fileInnerText = new String(Files.readAllBytes(Path.of("1.txt")));

        byte[] md5InBytes = MD5Utils.digest(fileInnerText.getBytes(MD5Utils.UTF_8));

        return MD5Utils.bytesToHex(md5InBytes);

    }

    @PreDestroy
    public void testPreDestroy() throws IOException {
        List<String> lines = Collections.singletonList(testPostConstruct());
        Path file = Paths.get("2.txt");
        Files.write(file, lines, StandardCharsets.UTF_8);
        Files.delete(Path.of("1.txt"));
    }

}
