package com.proyecto.Booking.service.dto;


import com.proyecto.Booking.entities.Author;


import java.util.Date;

public class BookDTO {

    private Integer id;

    private String bookTitle;

    private Integer amountPages;

    private Date date;

    private Author author;

    public Integer getId() {
        return id;
    }

    public BookDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public BookDTO setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
        return this;
    }

    public Integer getAmountPages() {
        return amountPages;
    }

    public BookDTO setAmountPages(Integer amountPages) {
        this.amountPages = amountPages;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public BookDTO setDate(Date date) {
        this.date = date;
        return this;
    }

    public Author getAuthor() {
        return author;
    }

    public BookDTO setAuthor(Author author) {
        this.author = author;
        return this;
    }
}
