package com.company;
import java.lang.*;
import java.security.spec.RSAOtherPrimeInfo;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Medicine", "J. K. James");
        Book b2 = new Book("Mathematics", "S. S. Simpson");
        Book b3 = new Book("History");
        b3.setAuthor("U. S. Artur");
        System.out.println(b3.getName() + " " + b3.getAuthor());
        System.out.println(b1.toString());
    }
}
