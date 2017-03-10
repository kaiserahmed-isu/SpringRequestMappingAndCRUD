package com.crudappgroup.service;

import com.crudappgroup.model.Post;

import java.util.List;

/**
 * Created by Razon on 09-Mar-17.
 */
public interface  PostService {
    public List<Post> findAll();
    public Post findOne(Long id);
    public void savePost(Post post);
    public void delete(Long id);
}
