package com.webExemple6.Exemple6.Bootstrap;

import com.webExemple6.Exemple6.Domain.Author;
import com.webExemple6.Exemple6.Domain.Book;
import com.webExemple6.Exemple6.Repositories.AuthorRepository;
import com.webExemple6.Exemple6.Repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric","Evian");
        Book ddd = new Book("design titre commun", "12345");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author roc = new Author("Salhi", "Halima");
        Book noIJB = new Book("cultuuurre de sage","123456");
        roc.getBooks().add(noIJB);
        noIJB.getAuthors().add(roc);

        authorRepository.save(roc);
        bookRepository.save(noIJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number de book"+ bookRepository.count());









    }
}
