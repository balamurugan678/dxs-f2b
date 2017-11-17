package com.poc.dxs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import static java.lang.System.exit;

/**
 * Created by Bala on 17/11/2017.
 */
public class DXSMain implements CommandLineRunner {

    public static void main(String[] args) throws Exception {

        SpringApplication app = new SpringApplication(DXSMain.class);
        app.run(args);

    }

    @Override
    public void run(String... args) throws Exception {

        if (args.length > 0) {
            System.out.println("sfsa");
        } else {
            System.out.println("HEY, I am working");
        }

        exit(0);
    }
}
