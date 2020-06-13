package com.priyakshi.hellouser;

import java.util.Scanner;

public class SayHello {
    public void sayHelloToTUser() {
        System.out.println("Enter User Name");
        String name = getNameFromUser();
        System.out.println("Hello " + name);
    }

    protected String getNameFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}