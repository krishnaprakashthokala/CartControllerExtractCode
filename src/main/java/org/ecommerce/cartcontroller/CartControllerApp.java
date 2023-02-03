package org.ecommerce.cartcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({})
public class CartControllerApp {
    public static void main(String[] args)
    {
      SpringApplication.run(CartControllerApp.class, args);
    }
}