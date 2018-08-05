package ua.logos.service;

import ua.logos.entity.Book;
import ua.logos.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    User findById(Long id);

    List<Book> findAllBooks();

}
