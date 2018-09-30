package com.company;

public class Book {
    private String author;
    private int currentPage;
    public Book(String author, int currentPage){
        this.author = author;
        this.currentPage = currentPage;
    }
    public Book(String author) {
        this.author = author;
        currentPage = 1;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPage(int currentPage) {
        this.currentPage = currentPage;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getPage() {
        return this.currentPage;
    }
    public void turnPage() {
        System.out.println(author+"'s book page was turned from "+currentPage+" to "+(currentPage+1));
        currentPage +=1;
    }
    @Override
    public String toString() {
        return this.author+"'s book is now on page "+this.currentPage;
    }
}