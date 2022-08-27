/***************************************************************************************************************
 *
 * UC1 : Create a Helloworld Spring App to display “Hello from BridgeLabz” using STS
 *
 * @author : Kisalay
 * @since  : 27-08-2022
 *
 **************************************************************************************************************/
package com.example.springappdevelopment_beginning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAppDevelopment_Beginning {

    public static void main(String[] args) {
        /**
         * Purpose : Print statement to display "Hello from BridgeLabz"
         */

        System.out.println("Hello from BridgeLabz");
        SpringApplication.run(SpringAppDevelopment_Beginning.class, args);
    }

}
