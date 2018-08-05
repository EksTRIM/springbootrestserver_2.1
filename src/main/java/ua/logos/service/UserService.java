package ua.logos.service;

import ua.logos.entity.User;

public interface UserService {

    void saveUser(User user);

    User findById(Long id);



}
