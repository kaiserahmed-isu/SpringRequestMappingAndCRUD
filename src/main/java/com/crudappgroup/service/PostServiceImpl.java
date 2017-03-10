package com.crudappgroup.service;

import com.crudappgroup.model.Post;
import com.crudappgroup.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by Razon on 09-Mar-17.
 */
@Service("PostService")
@Transactional
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> findAll(){
        return (List<Post>) postRepository.findAll();
    }
    public Post findOne(Long id){
        return postRepository.findOne(id);

    }
    public void savePost(Post post){
        postRepository.save(post);
    }
    public void delete(Long id){
        postRepository.delete(id);

    }

}
