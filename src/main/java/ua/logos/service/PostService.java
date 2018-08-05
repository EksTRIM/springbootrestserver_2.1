package ua.logos.service;

import ua.logos.entity.Post;

import java.util.List;

public interface PostService {

    void savePost(Post post);

    Post findById(Long id);

    List<Post>findAllPost();
}
