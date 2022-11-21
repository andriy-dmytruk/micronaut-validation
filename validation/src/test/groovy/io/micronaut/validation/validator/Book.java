package io.micronaut.validation.validator;

import io.micronaut.core.annotation.Introspected;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.List;

@Introspected
public class Book {
    @Size(min=2)
    private String name;

    private List<@Valid Author> authors;

    public Book(String name) {
        this.name = name;
        this.authors = null;
    }

    public Book(String name, List<Author> authors) {
        this.name = name;
        this.authors = authors;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public String getName() {
        return name;
    }
}
