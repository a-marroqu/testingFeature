package com.app.testing.module;

import com.app.testing.module.controller.PatientController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ModuleApp {

    public static void main(String[] args) {
        SpringApplication.run(ModuleApp.class, args);
    }

}
