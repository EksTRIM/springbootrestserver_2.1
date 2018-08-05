package ua.logos.service;


import ua.logos.domain.BookDTO;
import ua.logos.entity.Book;

import java.util.List;

public interface BookService {

    void  saveBook(BookDTO bookDTO);

    BookDTO findById(Long id);

    List<BookDTO> findAllBooks();

    void deleteBook(Long id);

    List<BookDTO> findBookByCategoryId(long id);
}
