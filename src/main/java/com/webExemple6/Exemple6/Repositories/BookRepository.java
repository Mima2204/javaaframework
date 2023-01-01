package com.webExemple6.Exemple6.Repositories;

import com.webExemple6.Exemple6.Domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
