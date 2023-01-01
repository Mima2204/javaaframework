package com.webExemple6.Exemple6.Repositories;

import com.webExemple6.Exemple6.Domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
