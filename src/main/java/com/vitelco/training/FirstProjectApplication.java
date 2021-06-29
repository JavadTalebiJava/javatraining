package com.vitelco.training;

import com.vitelco.training.cevat.Sample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApplication.class, args);

        Sample sample = new Sample();
        sample.myMethod();

    }

}
