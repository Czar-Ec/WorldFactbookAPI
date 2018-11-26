package io.github.czarec.worldFactbook;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WorldFactbookApplication {

    public static void main(String[] args) throws BeansException, InterruptedException {
        SpringApplication.run(WorldFactbookApplication.class, args);
    }
}