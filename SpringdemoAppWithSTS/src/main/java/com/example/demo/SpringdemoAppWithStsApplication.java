/***************************************************************************************************************
 *
 * UC1 : Create a Helloworld Spring App to display “Hello from BridgeLabz” using STS
 *
 * @author : Immanuvel Jeeva
 * @since  : 13-09-2021
 *
 **************************************************************************************************************/
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoAppWithStsApplication {

    public static void main(String[] args) {

        /**
         * Purpose : Print statement to display "Hello from BridgeLabz"
         */

        System.out.println("Hello from BridgeLabz");
        SpringApplication.run(SpringdemoAppWithStsApplication.class, args);
    }

}
