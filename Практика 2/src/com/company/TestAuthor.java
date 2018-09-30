package com.company;

public class TestAuthor {

    public static void main(String[] args)
    {
        Author test1 = new Author();
        Author test2 = new Author("Tolkien", "tolkien@mail.ru", 'M');
        test1.setEmail("gert@gmail.com");
        System.out.println(test2);
    }
}
