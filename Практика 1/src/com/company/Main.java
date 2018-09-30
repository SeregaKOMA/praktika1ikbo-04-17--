package com.company;

public class Main {

    public static void main(String[] args)
    {
        Ball b1 = new Ball("Handball","Blue");
        Ball b2 = new Ball("Gandball");
        b1.setGame("Foolball");
        b2.setColor("Purple");
        b1.isBall();
        b2.isBall();
        Book book1 = new Book("Tolkien",150);
        Book book2 = new Book("Serov");
        book1.setAuthor("Moravia");
        book2.setPage(20);
        book1.turnPage();
        book2.turnPage();
        System.out.println(book1);
        System.out.println(book2);
    }
}
