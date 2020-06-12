package main.com.priyakshi;

import java.util.Scanner;

public class SayHello {
    public void SayHelloToTUser(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Name");
        name = scanner.next();
        System.out.println("Hello " + name);
    }
}