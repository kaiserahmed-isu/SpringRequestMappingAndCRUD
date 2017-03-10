package com.crudappgroup.controller;

import com.crudappgroup.model.Post;
import com.crudappgroup.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Razon on 09-Mar-17.
 */

@Controller
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping(value="/post/create/{title}/{body}", method= RequestMethod.GET)
    @ResponseBody
    public String createPost(@PathVariable("title") String title, @PathVariable("body") String body) {
        Post post = new Post();
        post.setTitle(title);
        post.setBody(body);
        postService.savePost(post);
        return "Post Created!";
    }

    @RequestMapping(value="/post/update/{id}/{title}/{body}", method= RequestMethod.GET)
    @ResponseBody
    public String updatePost(@PathVariable("id") Long id, @PathVariable("title") String title, @PathVariable("body") String body) {
        Post post = postService.findOne(id);
        post.setTitle(title);
        post.setBody(body);
        postService.savePost(post);
        return "Post Updated!";
    }

    @RequestMapping(value="/post/read/{id}", method= RequestMethod.GET)
    @ResponseBody
    public String readPost(@PathVariable("id") Long id) {
        Post post = postService.findOne(id);
        return "Post id: " + post.getId() + " Title: "+ post.getTitle() + "Body: " + post.getBody();
    }

    @RequestMapping(value="/post/delete/{id}", method= RequestMethod.GET)
    @ResponseBody
    public String deletePost(@PathVariable("id") Long id) {
        postService.delete(id);
        return "Post Deleted!";
    }

}
