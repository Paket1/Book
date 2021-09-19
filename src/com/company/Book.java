package com.company;
import java.lang.*;
public class Book {
    private String name;
    private String author;

    public Book(String n, String a){
        name = n;
        author = a;
    }

    public Book(String n){
        name = n;
        author = "None";
    }
    public Book(){
        name = "None";
        author = "None";
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public String toString(){
        return this.name+", author is "+this.author;
    }
}
