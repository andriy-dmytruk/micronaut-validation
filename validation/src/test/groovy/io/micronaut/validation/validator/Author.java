package io.micronaut.validation.validator;

import io.micronaut.core.annotation.Introspected;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Introspected
public class Author {
    @NotBlank
    private String name;

    private List<@Valid Book> books;

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public Author(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }
}
